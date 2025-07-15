package com.example.festivos;

public class Festivo {
    private String nombre;
    private int dia;
    private int mes;
    private int diasPascua;
    private String tipo;

    public Festivo(String nombre, int dia, int mes, int diasPascua, String tipo) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.diasPascua = diasPascua;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getDiasPascua() { return diasPascua; }
    public String getTipo() { return tipo; }
}
