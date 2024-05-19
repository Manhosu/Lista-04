package br.edu.up.models;

public class Estacionamento {

    private Vaga[] vagas;
    private int cont;
    private int totalVagas = 10;
    private int vagaDisponivel;


    public Estacionamento() {
        this.vagas = new Vaga[totalVagas];
        incializarVagas();
    }
    public void incializarVagas(){
        vagas[0] = new Vaga(1);
        vagas[1] = new Vaga(2);
        vagas[2] = new Vaga(3);
        vagas[3] = new Vaga(4);
        vagas[4] = new Vaga(5);
        vagas[5] = new Vaga(6);
        vagas[6] = new Vaga(7);
        vagas[7] = new Vaga(8);
        vagas[8] = new Vaga(9);
        vagas[9] = new Vaga(10);
    }

    public Vaga getVagas(int i) {
        return vagas[i];
    }
    public int getTotalVagas() {
        return totalVagas;
    }
    public Vaga[] getVagas() {
        return vagas;
    }

    public int encontrarVagaDisponivel() {
        for (int i = 0; i < totalVagas; i++) {
            if (!vagas[i].ocupada()) { 
                this.vagaDisponivel = i;
                return i; 
            }
        }
        return -1 ;
    }
    public String verificarPlaca(String placa){
        for(int i=0; i < 10; i++){
            if (vagas[i].getCarroPlaca()!=null && vagas[i].getCarroPlaca().equals(placa)) {
                return "1";
            }
        }
        return null;
    }

    public int getVagaDisponivel() {
        return vagaDisponivel;
    }
    
}
