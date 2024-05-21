package br.edu.up.controllers;

import br.edu.up.models.Evento;
import java.util.ArrayList;
import java.util.List;

public class ControleEvento {

    private List<Evento> eventos;

    public ControleEvento() {
        this.eventos = new ArrayList<>();
    }

    public String incluirEvento(String nome, String data, String local, int lotacaoMax, double precoIngresso) {
        Evento evento = new Evento(nome, data, local, lotacaoMax, precoIngresso);
        eventos.add(evento);
        return "ok";
    }

    public String conferirNomeEvento(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nome)) {
                return "ok";
            }
        }
        return "fail";
    }

    public String conferirDataEvento(String data) {
        for (Evento evento : eventos) {
            if (evento.getData().equals(data)) {
                return "ok";
            }
        }
        return "fail";
    }

    public String ingressosDisponiveis(String nomeEvento, int quantidadePessoas) {
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nomeEvento) && evento.getLotacaoMax() >= quantidadePessoas) {
                return "ok";
            }
        }
        return "fail";
    }

    public List<Evento> listagemDeEventos() {
        return eventos;
    }
}
