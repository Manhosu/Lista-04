package br.edu.up.controllers;

import br.edu.up.models.*;

public class ControlePassageiro {

    Passageiro[] passageiros = new Passageiro[10];

    public String adicionarPassageiro(String nome, int rg, int idBagagem, String acento, String classe){
        for(int i=0; i < 10; i++){
            if(passageiros[i]==null){
                passageiros[i] = new Passageiro(nome,rg,idBagagem);
                passageiros[i].registrarPassagem(nome,  acento,  classe);
                return passageiros[i].toString();
        }
    }
    return "null";
    }

    public String listarPassageiros(){
        int num =0;
        StringBuilder res = new StringBuilder();
        for(int i=0; i < passageiros.length; i++){
            if(passageiros[i] != null){
                res.append(passageiros[i].toString()).append("\n");
                num++;
            }
        }
        if (num ==0) {
            res.append("Não há passageiros cadastrados!!");
        }
        return res.toString();
    }


 }