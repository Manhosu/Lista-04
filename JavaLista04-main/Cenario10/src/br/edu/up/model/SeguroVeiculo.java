package br.edu.up.model;

public class SeguroVeiculo extends Seguro {
    private double valorFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidro;

    public SeguroVeiculo(String apolice, Segurado segurado, double valorFranquia, boolean temCarroReserva, boolean cobreVidro) {
        super(apolice, segurado);
        this.valorFranquia = valorFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidro = cobreVidro;
    }

    public double getValorFranquia() {
        return valorFranquia;
    }

    public void setValorFranquia(double valorFranquia) {
        this.valorFranquia = valorFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidro() {
        return cobreVidro;
    }

    public void setCobreVidro(boolean cobreVidro) {
        this.cobreVidro = cobreVidro;
    }

    @Override
    public String getDetalhesEspecificos() {
        return "Valor da Franquia: " + valorFranquia + "\nTem Carro Reserva: " + (temCarroReserva ? "Sim" : "Não") + "\nCobre Vidro: " + (cobreVidro ? "Sim" : "Não");
    }
}
