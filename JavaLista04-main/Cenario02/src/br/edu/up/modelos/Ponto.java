package br.edu.up.modelos;

public class Ponto {
  
    private double pontox; 
    private double pontoy;

    public Ponto() {
        pontox = 0;
        pontoy = 0;
    }

    public Ponto(double pontox, double pontoy) {
        this.pontox = pontox;
        this.pontoy = pontoy;
    }

    public double distancia(Ponto pont) {
        double distancia = Math.sqrt(Math.pow((pont.pontox - pontox), 2) + Math.pow((pont.pontoy - pontoy), 2));
        return distancia;
    }

    public double getX() {
        return pontox;
    }

    public double getY() {
        return pontoy;
    }
}
