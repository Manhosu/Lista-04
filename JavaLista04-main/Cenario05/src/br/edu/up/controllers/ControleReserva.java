package br.edu.up.controllers;

import br.edu.up.models.*;


public class ControleReserva {
    Reserva[] reservas = new Reserva[10];

    public String incluirReserva( String nome, int quantidadePessoas, String data, String nomeEvento, double valor) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = new Reserva(nome, quantidadePessoas, data, nomeEvento, valor);
                return "ok";
            }
        }
        return "null";
    }

    public String listarReservas(){
        int num =0;
        StringBuilder res = new StringBuilder();
        for(int i=0; i < reservas.length; i++){
            if(reservas[i] != null){
                res.append("Nome do responsável da reserva: " ).append(reservas[i].getNome()).append(", Nome do evento: ").append(reservas[i].getNomeEvento()).append(", Data do reserva: ").append(reservas[i].getDataReserva()).append(", Quantidade de ingressos na reserva: ").append(reservas[i].getQuantidadePessoas()).append(", Valor Total da reserva: ").append(reservas[i].getQuantidadePessoas()* reservas[i].getValorIngressoEvento());
                num++;
            }  
        }
        if (num ==0) {
            res.append("Não há reservas registradas!!");
        }
        return res.toString();
    }

    public String removerReserva(String nomeEvento, String nome, String dataEvento, int qtd){
        for(int i=0; i < reservas.length; i++){
            if (reservas[i].getNome().equals(nome) && reservas[i].getNomeEvento().equals(nomeEvento) && reservas[i].getDataReserva().equals(dataEvento) && reservas[i].getQuantidadePessoas() == qtd) {
                reservas[i] = null;
                return "ok";
                
            }
        }
        return "null";
    }

    public String alterarNomeResponsavel(String nomeAntigo, String nomeNovo){
        for(int i =0; i < reservas.length; i++){
            if (reservas[i].getNome().equals(nomeAntigo)) {
                reservas[i].setNome(nomeNovo);
                return "ok";
            }
        }
        return "null";
    }

    public String alterarQuantidadePessoas(int qtdAntigo, int qtdNovo){
        for(int i =0; i < reservas.length; i++){
            if (reservas[i].getQuantidadePessoas() == qtdAntigo) {
                reservas[i].setQuantidadePessoas(qtdNovo);
                return "ok";
            }
        }
        return "null";
    }

    public Reserva[] getReservas() {
        return reservas;
    }
    public Reserva getReservas(int i) {
        return reservas[i];
    }
    
}
            
        



    

