// Segurado.java
package br.edu.up.model;

public class Segurado {
    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private String endereco;
    private String telefone;
    private String cep;
    private String cidade;

    public Segurado(String nome, String cpf, String rg, String sexo, String endereco, String telefone, String cep, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nSexo: " + sexo + "\nEndereço: " + endereco +
               "\nTelefone: " + telefone + "\nCEP: " + cep + "\nCidade: " + cidade;
    }
}
