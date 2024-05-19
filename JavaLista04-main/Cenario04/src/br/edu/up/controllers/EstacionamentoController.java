package br.edu.up.controllers;
import br.edu.up.models.*;



public class EstacionamentoController {

    private int contEntrada = 0;
    private int carros2Periodo;
    

    Estacionamento est = new Estacionamento();

    public String registrarEntrada(String placa, String modelo, String cor) {
        int vagaDisponivel = est.encontrarVagaDisponivel();
        if (vagaDisponivel != -1) {
            if (validaPlaca(placa) == true) {
                contEntrada++;
                est.getVagas(vagaDisponivel).ocuparVaga(placa, modelo, cor);
                return  "OK";
            }else{
                return "null";
            }
        } else {
            return "null";
        }
    }

    public String registarSaida(String placa){
        for(int i = 0; i < 10; i++){
            if (est.verificarPlaca(placa) != null && est.verificarPlaca(placa).equals("1")) {
                if (est.getVagas(i).getCarroPlaca() != null && est.getVagas(i).getCarroPlaca().equals(placa)) {
                    est.getVagas(i).liberarVaga();
                    return "OK"; 
                }
            }
        }
        return "OFF";
    }
    


    public int contarVagasDisponiveis() {
        int contador = 0;
        for (Vaga vaga : est.getVagas()) {
            if (!vaga.ocupada()) { 
                contador++; 
            }
        }
        return contador;
    }
    public int consultarVaga(String placa){
        for(int i=0; i<10; i++){
            if (est.getVagas(i).getCarroPlaca().equals(placa)) {
                return est.getVagas(i).getNumero();
            }
            
        }
        return 0;
    }
    public Double finalizarPeriodo(){
        Double valorFinal = contEntrada*5.00;
        return valorFinal;
    }

    public Double finalizarPeriodoTarde(){
        double valorFinal = (contEntrada+ carros2Periodo) * 5.00;
        return valorFinal;
    }

    public int carros2Periodo(){
        this.carros2Periodo = 10- contarVagasDisponiveis();
        return carros2Periodo;
    }
    public double finalizarPeriodoNoite(){
        double valorFinal = (contEntrada + carros2Periodo) * 5.00;
        return valorFinal;
    }

    public int getContEntrada() {
        return contEntrada;
    }
    
    

    public int getCarros2Periodo() {
        return carros2Periodo;
    }

    public void setContEntrada(int contEntrada) {
        this.contEntrada = contEntrada;
    }

    public boolean validaPlaca(String placa){
        String[] partes = placa.split("-");
        if(partes.length != 2 || partes[0].length() != 3) {
            return false;
        }
        if (!partes[1].matches("[0-9a-zA-Z]+")) {
            return false;}
        return true;}
}
 
