import { Component } from '@angular/core';
import { FestivoService } from './festivo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  fecha = '';
  anio = '';
  resultadoFestivo: string = '';
  festivos: any[] = [];

  constructor(private festivoService: FestivoService) {}

  verificarFestivo() {
    this.festivoService.verificarFestivo(this.fecha).subscribe(res => {
      this.resultadoFestivo = res.esFestivo
        ? '✅ Es festivo'
        : '❌ No es festivo';
    });
  }

  listarFestivos() {
    this.festivoService.listarFestivos(this.anio).subscribe(data => {
      this.festivos = data;
    });
  }
}
