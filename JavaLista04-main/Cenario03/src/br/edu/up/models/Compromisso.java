package br.edu.up.models;

public class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;
   
    Compromisso(String pessoa, String local, String assunto) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
    }
    
    public String getPessoa() {
        return pessoa;
    }
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    @Override
    public String toString() {
        return "Pessoa: " + pessoa + ", Local: " + local + ", Assunto: " + assunto + " ";
    }
    

    
}
