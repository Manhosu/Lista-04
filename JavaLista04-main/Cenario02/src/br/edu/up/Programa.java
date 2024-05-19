package br.edu.up;

import br.edu.up.modelos.*;

public class Programa {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        double distanciaEntrePts = ponto1.distancia(ponto2);
        System.out.println("a distancia entre os dois pontos e de:" + distanciaEntrePts);

        Ponto ponto3 = new Ponto(7, 2);
        double distanciaEntrePts2 = ponto2.distancia(ponto3);
        System.out.println("a distancia do ponto2 para (7,2) e: " + distanciaEntrePts2);

        ponto1 = new Ponto(10, ponto1.getY());
        ponto1 = new Ponto(ponto1.getX(), 3);

        System.out.println("coordenadas do ponto1: (" + ponto1.getX() + "," + ponto1.getY() + ")");
    }
}
