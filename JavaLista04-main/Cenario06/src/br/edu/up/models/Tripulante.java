package br.edu.up.models;

public abstract class Tripulante extends Pessoa {

    private int idAeronautica;
    private int matrculafunc;
    private Voo[] voos;

    public Tripulante(String nome, int rg, int idAeronautica, int matrculafunc) {
        super(nome, rg);
        this.idAeronautica = idAeronautica;
        this.matrculafunc = matrculafunc;
    }

    public int getIdAeronautica() {
        return idAeronautica;
    }

    public void setIdAeronautica(int idAeronautica) {
        this.idAeronautica = idAeronautica;
    }

    public int getMatrculafunc() {
        return matrculafunc;
    }

    public void setMatrculafunc(int matrculafunc) {
        this.matrculafunc = matrculafunc;
    }

  
}
