package br.edu.up.models;

public abstract class Pessoa {

    private String nome;
    private int rg;
    
    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }

    
    

}
