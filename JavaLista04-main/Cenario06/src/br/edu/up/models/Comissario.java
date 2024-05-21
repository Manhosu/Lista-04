package br.edu.up.models;

public class Comissario extends Tripulante{

    private String idiomas;
    public Comissario(String nome, int rg,int id, int matriclua, String idiomas) {
        super(nome, rg, id, matriclua);
        this.idiomas = idiomas;
    }
    public String getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }


    @Override
    public String toString(){
        super.getNome();
        super.getRg();
        super.getIdAeronautica();
        super.getMatrculafunc();
        return "Comissário [Nome ="+ super.getNome()
        + ", RG ="+super.getRg()
        + ", Id ="+super.getIdAeronautica()
        + ", Matricula ="+ super.getMatrculafunc()
        + ", Idiomas =" + idiomas +"]";
    }
    

    
    
}
