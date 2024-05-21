package br.edu.up.models;

public class Comandante extends Tripulante{
    
    private int totalHrsVoo;

    public Comandante(String nome, int rg, int id, int matrcula, int horasVoo) {
        super(nome, rg, id, matrcula);
        this.totalHrsVoo = horasVoo;

    }

    @Override
    public String toString(){
        super.getNome();
        super.getRg();
        super.getIdAeronautica();
        super.getMatrculafunc();
        return "Comandante [Nome ="+ super.getNome()
        + ", RG ="+super.getRg()
        + ", Id ="+super.getIdAeronautica()
        + ", Matricula ="+ super.getMatrculafunc()
        + ", Horas de Vôo =" + totalHrsVoo +"]";
    }
    
    
}
