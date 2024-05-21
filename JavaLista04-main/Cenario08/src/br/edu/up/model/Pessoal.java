package br.edu.up.model;

public class Pessoal extends Contato {
  
private String aniversario;

public Pessoal(int codigo, String nome, String telefone, String aniversario){

  super(codigo, nome, telefone);
  this.aniversario = aniversario;

}

public String getCnpj() {
  return aniversario;
}

public void setCnpj(String aniversario) {
  this.aniversario = aniversario;
}
public String ToString(){

  return super.ToString() + "\n Aniversario: " + aniversario;
} 

}
