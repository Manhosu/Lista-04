package br.edu.up.models;

public class Dia {
    private int num;
    private int cont;
    private Compromisso[] compromissos;


    public Dia(int num) {
        this.num = num;
        this.compromissos = new Compromisso[24];
        this.cont = 0;
    }

    public String addCompromisso(int hora, String pessoa, String local, String assunto) {
        if (hora >= 1 && hora < 24) {
            if (compromissos[hora-1] == null) {
                compromissos[hora-1] = new Compromisso(pessoa, local, assunto);
                cont++;
            } else {
                return null;
            }
        } else {
            return null;
        }
        return "";
    }

    public String consultarCompromisso(int hora) {
        if (hora >= 1 && hora < 24) {
            if (compromissos[hora - 1] != null) {
                return compromissos[hora-1] + "Horario: " + hora + ", ";
            } else {
                return "1";
            }
        } else {
            return null;
        }
    }

    public String removerCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            if (compromissos[hora-1] != null) {
                compromissos[hora-1] = null;
                cont--;
            }else{
                return null;
            }
        } else {
            return null;
        }
        return "";
    }

    public String listarCompromissos() {
        String compromissosListados = "";
        for (int i = 0; i < 24; i++) {
            if (compromissos[i] != null) {
                compromissosListados += "Hora: " + (i+1) + " " + compromissos[i]+ "\n";
            }
        }
        return compromissosListados.isEmpty() ? null : compromissosListados;
    }

}