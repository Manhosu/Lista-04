package br.edu.up.models;

public class Voo {
    private Aeronave aeronaves = new Aeronave();

    public String toString(){
        return "Voo: [ Código: "+aeronaves.getCodigo()
        +", Modelo do avião: "+aeronaves.getTipo()
        +", Quantidade de assentos: "+aeronaves.getQuantAssentos()+" ]";
    }

  
}
