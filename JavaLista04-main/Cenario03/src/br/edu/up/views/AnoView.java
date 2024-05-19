package br.edu.up.views;

public class AnoView {
    public void notificarCompromissoRealizado(int num, int mes, int dia, int hora, String pessoa, String local, String assunto){
        System.out.println("Compromisso agendado para o ano de: ["+ num +"], no mês de: ["+mes+"], para o dia: ["+dia+ "] as [" + hora + "] horas " +
        "\n[Pessoa: " + pessoa + ", Local: " + local + ", Assunto: " + assunto+"]\n");
    }
    public void notificarCompromissoJaAgendado( int mes, int dia, int hora){
        System.out.println("Já existe um compromisso agendado para o mês de"+ mes+" às " + hora + "h. do dia: "+ dia);
    }
    public void mensagem(String str){
        System.out.println(str);
    }

    
}
