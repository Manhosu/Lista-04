package br.edu.up.controllers;

import javax.xml.crypto.Data;
import br.edu.up.models.*;

public class ControleEvento {
    int tamanho =10;
       Evento[] eventos = new Evento[tamanho];
       



    public String incluirEvento(String nome, String data, String local, int lotacaoMax, Double precoIngresso){
          for(int i = 0; i < 10; i++){
             if(eventos[i] == null){
                eventos[i] = new Evento(nome, data, local, lotacaoMax, precoIngresso);
                return "ok";
            } 
        }
        return "null";
    }

    public String listagemDeEventos(){
        int num = 0;
        StringBuilder res = new StringBuilder();
        for(int i =0; i < eventos.length; i++){
            if (eventos[i] != null) { 
                res.append("\nNome do Evento: ").append(eventos[i].getNome()).append(", Local: ").append(eventos[i].getLocal()).append(", Data: ").append(eventos[i].getData()).append(" Lotação máxima: ").append(eventos[i].getLotacaoMax()).append(", Ingressos disponíveis: ").append(eventos[i].getIngressosDisponiveis());
                num++;
            }
        }
        if (num == 0) {
            res.append("Não há eventos adicionados!!");
        }
        return res.toString();
    }

    public String excluirEvento(String nome, String data, String local){
        for(int i=0; i < eventos.length; i++){
            if (eventos[i].getNome().equals(nome) && eventos[i].getData().equals(data) && eventos[i].getLocal().equals(local)) {
                eventos[i] = null;
                return "ok";
            }
        }
        return "null";
    }
    public String alterarNomeEvento(String nomeAntigo, String nomeNovo){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getNome().equals(nomeAntigo)) {
                eventos[i].setNome(nomeNovo);
                return "OK";
            }
        }
        return "null";
    }
    public String alterarDataEvento(String dataAntiga, String dataNova){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getData().equals(dataAntiga)) {
                eventos[i].setData(dataNova);;
                return "OK";
            }
        }
        return "null";

    }
    public String alterarLocalEvento(String localAntigo, String localNovo){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getLocal().equals(localAntigo)) {
                eventos[i].setLocal(localNovo);
                return "OK";
            }
        }
        return "null";
    }
    public String alterarLotacaoEvento(int lotacaoAntiga, int lotacaoNova){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getLotacaoMax() == lotacaoAntiga) {
                eventos[i].setLotacaoMax(lotacaoNova);
                return "OK";
            }
        }
        return "null";
    }
    public String alterarPrecoEvento(double precoAntigo, double precoNovo){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getPrecoIngresso() ==precoAntigo) {
                eventos[i].setPrecoIngresso(precoNovo);
                return "OK";
            }
        }
        return "null";

    }

    public Evento[] getEventos() {
        return eventos;
    }

    public String conferirNomeEvento(String nome){
        for(int i=0; i< eventos.length; i++){
            if (eventos[i] != null &&  eventos[i].getNome().equals(nome)) {
                return "ok";
            }
        }
        return "null";
    }
    public String conferirDataEvento(String data){
        for(int i=0; i< eventos.length; i++){
            if ( eventos[i] != null &&eventos[i].getData().equals(data)) {
                return "ok";
            }
        }
        return "null";
    }

    public int verificarEAtualizarIngressos(String nome, int qtd) {
        for (int i = 0; i < tamanho; i++) {
            if (eventos[i] != null && eventos[i].getNome().equals(nome)) {
                int ingressosDisponiveis = eventos[i].getIngressosDisponiveis();
                if (ingressosDisponiveis >= qtd) {
                    // Reduzir o número de ingressos disponíveis
                    eventos[i].setIngressosDisponiveis(ingressosDisponiveis - qtd);
                    return 1; // Ingressos disponíveis e atualizados
                } else {
                    return 0; // Ingressos insuficientes
                }
            }
        }
        return -1; // Evento não encontrado
    }

    public double retornarIngressos(String nomeEvento, int qtd){
        for(int i=0; i < eventos.length; i++){
            if (eventos[i].getNome().equals(nomeEvento)) {
                eventos[i].setIngressosDisponiveis(eventos[i].getIngressosDisponiveis() + qtd);
                return 1;
            }
        }
        return 0;
    }

    public double pegarValorIngresso(String nomeEvento){
        for(int i=0; i < eventos.length; i++){
            if (eventos[i].getNome().equals(nomeEvento)) {
                return eventos[i].getPrecoIngresso();
            }
        }
        return 0;
    }
    public String validarData(String data){
        String[] partes = data.split("/");
        
        // Verificando se a data possui três partes
        if (partes.length != 3)
            return "false";
        
        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            
            // Verificando se o dia, mês e ano estão dentro dos limites aceitáveis
            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0)
                return "false";
            
            // Verificando se o mês tem 30 ou 31 dias
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)
                return "false";
            
            // Verificando se o ano é bissexto
            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
            if (mes == 2 && (dia > 29 || (dia == 29 && !bissexto)))
                return "false";
            
            return "true";
        } catch (NumberFormatException e) {
            // Se não for possível converter para int, retorna falso
            return "false";
        }
    }
    
    
    

}
