package br.edu.up.model;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public SeguroVida(String apolice, Segurado segurado, boolean cobreDoenca, boolean cobreAcidente) {
        super(apolice, segurado);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    public boolean getcobreDoenca() {
        return cobreDoenca;
    }

    public void setcobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean getcobreAcidente() {
        return cobreAcidente;
    }

    public void setcobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDetalhesEspecificos() {
      return "Cobre Doença: " + (cobreDoenca ? "Sim" : "Não") + "\nCobre Acidente: " + (cobreAcidente ? "Sim" : "Não");
    }
}
