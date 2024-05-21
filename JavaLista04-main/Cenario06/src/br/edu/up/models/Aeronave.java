package br.edu.up.models;

public class Aeronave {

    private int codigo;
    private String tipo;
    private int quantAssentos;

    public Aeronave() {
        this.codigo = 2024 ;
        this.tipo = "A380";
        this.quantAssentos = 535;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantAssentos() {
        return quantAssentos;
    }

    

 
}
