package br.edu.up.models;

public class Passagem {
    Data data = new Data();
    Voo voo = new Voo();

    private String nomePassageiro;
    private String assento;
    private String classe;
   
    public Passagem(String nome, String assento, String classe) {
        this.nomePassageiro = nome;
        this.assento = assento;
        this.classe = classe;

    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String acento) {
        this.assento = acento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    @Override
    public String toString() {
        return "Passagem=  [assento=" + assento + ", classe=" + classe + ", " + data.toString()+ ", " +voo.toString()+ "";
    }
    


}
