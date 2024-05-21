package br.edu.up.models;

public class Data {

    private int dia;
    private String mes;
    private int ano; 
    private int hora;
    private int minuto;

  public Data() {
    this.dia = 6;
    this.mes = "6";
    this.ano = 2024;
    this.hora = 17;
    this.minuto = 30;
  } 

  public String toString(){
    return "Data= [ Ano: "+ano
    +", Mes: "+ mes
    + ", Dia: "+ dia
    +", Hora: "+ hora
    +", Minuto: "+ minuto+" ]";
  }

  public int getDia() {
    return dia;
  }

  public String getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  public int getHora() {
    return hora;
  }

  public int getMinuto() {
    return minuto;
  }
  

}
