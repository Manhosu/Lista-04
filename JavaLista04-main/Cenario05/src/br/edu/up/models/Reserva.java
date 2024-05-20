
package br.edu.up.models;
import javax.xml.crypto.Data;

public class Reserva {

   Evento eventos;
   private String nome;
   private String nomeEvento;
   private int quantidadePessoas;
   private String dataReserva;
   private Double valorTotal;
   private double valorIngressoEvento;
   

   

   public Reserva(String nome, int quantidadePessoas, String dataReserva, String nomeEvento, double valor) {
      this.nome = nome;
      this.quantidadePessoas = quantidadePessoas;
      this.dataReserva = dataReserva;
      this.nomeEvento = nomeEvento;
      this.valorIngressoEvento = valor;
   }
   

   public double getValorIngressoEvento() {
      return valorIngressoEvento;
   }


   public String getNomeEvento() {
      return nomeEvento;
   }

   public void setNomeEvento(String nomeEvento) {
      this.nomeEvento = nomeEvento;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getQuantidadePessoas() {
      return quantidadePessoas;
   }

   public void setQuantidadePessoas(int quantidadePessoas) {
      this.quantidadePessoas = quantidadePessoas;
   }

   public String getDataReserva() {
      return dataReserva;
   }

   public void setDataReserva(String dataReserva) {
      this.dataReserva = dataReserva;
   }

   public Double getValorTotal() {
      return valorTotal;
   }

   public void setValorTotal(Double valorTotal) {
      this.valorTotal = valorTotal;
   }


   

   


}
