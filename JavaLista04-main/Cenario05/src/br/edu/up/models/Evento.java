package br.edu.up.models;


public class Evento {

    private String nome;
    private String data;
    private String local;
    private int lotacaoMax;
    private int ingressosDisponiveis;
    private Double precoIngresso;

    public Evento(String nome, String data, String local, int lotacaoMax, Double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMax = lotacaoMax;
        this.precoIngresso = precoIngresso;
        this.ingressosDisponiveis = lotacaoMax;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getLotacaoMax() {
        return lotacaoMax;
    }
    

    

    public Double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }

    public void setPrecoIngresso(Double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public int getIngressosDisponiveis() {
        return ingressosDisponiveis;
    }

    public void setIngressosDisponiveis(int ingressosDisponiveis) {
        this.ingressosDisponiveis = ingressosDisponiveis;
    }
    

    
    
}
