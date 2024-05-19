package br.edu.up.models;

public class Vaga {
    
    private int numero;
    private  Boolean ocupada = false;
    private Carro carro;
    private String carroPlaca;
    
    

    public Vaga(int numero) {
        this.numero = numero;
    }

    public void ocuparVaga(String placa, String modelo, String cor){

        this.ocupada = true;
        this.carro = new Carro(modelo, placa, cor);
        this.carroPlaca = carro.getPlaca();
    }

    public void liberarVaga(){
        this.ocupada = false;
        this.carroPlaca = null;
        this.carro = null;
        }
    
    

    public boolean ocupada(){
        return ocupada;
    }

    public Boolean getOcupada() {
        return ocupada;
    }
    public String estaOcupado(){
        if (ocupada == true) {
            return "sim";
        }
        return "não";}
    public Carro getCarro() {
        return carro;
    }

    public String getCarroPlaca() {
        return carroPlaca;
    }

    public int getNumero() {
        return numero;
    }

    
    

    
    

    
    
}
