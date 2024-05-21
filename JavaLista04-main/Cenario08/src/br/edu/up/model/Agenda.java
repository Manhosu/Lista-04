package br.edu.up.model;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

  private List<Contato> contatos;

  public Agenda(){
    contatos = new ArrayList<>();
  }
  public void incluirComercial(Comercial comercial){
    contatos.add(comercial);

  }
  public void incluirPessoal(Pessoal pessoal){
    contatos.add(pessoal);

  }

  public void removerContato(Contato contato) {
    contatos.remove(contato);
}
public Contato getContato(int codigo) {
  for (Contato contato : contatos) {
      if (contato.getCodigo() == codigo) {
          return contato;
      }
  }
  return null;
}

public List<Contato> getContato() {
    return contatos;
}
}
