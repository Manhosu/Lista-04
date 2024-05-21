package br.edu.up.controllers;

import br.edu.up.models.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ControleReserva {

    private List<Reserva> reservas;

    public ControleReserva() {
        this.reservas = new ArrayList<>();
    }

    public String incluirReserva(String nome, int quantidadePessoas, String data) {
        Reserva reserva = new Reserva(nome, quantidadePessoas, data);
        reservas.add(reserva);
        return "ok";
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
}
