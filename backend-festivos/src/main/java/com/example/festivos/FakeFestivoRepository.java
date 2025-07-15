package com.example.festivos;

import java.util.ArrayList;
import java.util.List;

public class FakeFestivoRepository {

    public static List<Festivo> getFestivos() {
        List<Festivo> festivos = new ArrayList<>();

        festivos.add(new Festivo("Año Nuevo", 1, 1, 0, "Fijo"));
        festivos.add(new Festivo("Día del Trabajo", 1, 5, 0, "Fijo"));
        festivos.add(new Festivo("Navidad", 25, 12, 0, "Fijo"));
        festivos.add(new Festivo("Santos Reyes", 6, 1, 0, "Ley Puente Festivo"));
        festivos.add(new Festivo("San José", 19, 3, 0, "Ley Puente Festivo"));
        festivos.add(new Festivo("Día de la Raza", 12, 10, 0, "Ley Puente Festivo"));
        festivos.add(new Festivo("Jueves Santo", 0, 0, -3, "Basado en Pascua"));
        festivos.add(new Festivo("Viernes Santo", 0, 0, -2, "Basado en Pascua"));
        festivos.add(new Festivo("Ascensión", 0, 0, 40, "Basado en Pascua y Ley Puente Festivo"));

        return festivos;
    }
}
