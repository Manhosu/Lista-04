package br.edu.up.controllers;

import br.edu.up.models.*;

public class ControleTripulante {

    Tripulante[] tripulantes = new Tripulante[10];

    public String registrarComissario(String nome, int rg, int id, int matriclua, String idiomas){
        for(int i=0; i < tripulantes.length; i++){
            if (tripulantes[i] == null) {
                tripulantes[i] = new Comissario(nome, rg, id, matriclua, idiomas);
                return tripulantes[i].toString();
                
            }
        }
        return "null";
    }

    public String registarComandante(String nome, int rg, int id, int matriclua, int horasVoo){
        for(int i=0; i < tripulantes.length; i++){
            if (tripulantes[i] == null) {
                tripulantes[i] = new Comandante(nome, rg, id, i, horasVoo);
                return tripulantes[i].toString();
            }
        }
        return "null";
    }

    public String listarTripulantes(){
        int num =0;
        StringBuilder res = new StringBuilder();
        for(int i=0; i < tripulantes.length; i++){
            if (tripulantes[i] != null) {
                res.append(tripulantes[i].toString()).append("\n");
                num++;
            }
        }
        if (num ==0) {
            res.append("Não há tripulantes cadastrados!!");
        }
        return res.toString();

    }
}
