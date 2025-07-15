package com.example.festivos;

import org.springframework.web.bind.annotation.*;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/festivos")
@CrossOrigin(origins = "*")
public class FestivoController {

    @GetMapping("/verificar")
public Map<String, Object> verificar(@RequestParam String fecha) {
    LocalDate f = LocalDate.parse(fecha);
    int anio = f.getYear();
    LocalDate pascua = calcularDomingoPascua(anio);

    boolean esFestivo = FakeFestivoRepository.getFestivos().stream()
        .map(evt -> {
            LocalDate festivo;
            if (evt.getDiasPascua() != 0) {
                festivo = pascua.plusDays(evt.getDiasPascua());
            } else {
                festivo = LocalDate.of(anio, evt.getMes(), evt.getDia());
            }

            if (evt.getTipo().contains("Ley")) {
                festivo = trasladarLunes(festivo);
            }

            return festivo;
        })
        .anyMatch(fechaCompuesta -> fechaCompuesta.equals(f));

    return Map.of(
        "fecha", fecha,
        "esFestivo", esFestivo
    );
}

    @GetMapping("/listar")
    public List<Map<String, Object>> listar(@RequestParam int anio) {
        LocalDate pascua = calcularDomingoPascua(anio);

        return FakeFestivoRepository.getFestivos().stream()
            .map(f -> {
                LocalDate fecha;
                if (f.getDiasPascua() != 0) {
                    fecha = pascua.plusDays(f.getDiasPascua());
                } else {
                    fecha = LocalDate.of(anio, f.getMes(), f.getDia());
                }

                if (f.getTipo().contains("Ley")) {
                    fecha = trasladarLunes(fecha);
                }

                Map<String, Object> map = new HashMap<>();
                map.put("nombre", f.getNombre());
                map.put("fecha", fecha.toString());
                return map;
            })
            .collect(Collectors.toList());
    }

    private LocalDate trasladarLunes(LocalDate fecha) {
        return fecha.getDayOfWeek() == DayOfWeek.MONDAY ? fecha :
               fecha.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    }

    private LocalDate calcularDomingoPascua(int anio) {
        int a = anio % 19;
        int b = anio / 100;
        int c = anio % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + l - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;
        return LocalDate.of(anio, month, day);
    }
}
