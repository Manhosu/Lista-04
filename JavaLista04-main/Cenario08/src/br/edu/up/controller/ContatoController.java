package br.edu.up.controller;
import br.edu.up.model.*;
import br.edu.up.view.*;


public class ContatoController {
  private ContatoView view;
  private Agenda agenda;

  public ContatoController(ContatoView view, Agenda agenda) {
      this.view = view;
      this.agenda = agenda;
  }

  public void start() {
      boolean funciona = true;

      while (funciona) {
          view.Menu();
          int choice = view.getEscolha();

          switch (choice) {
              case 1:
                  incluirContatoPessoal();
                  break;
              case 2:
                  incluirContatoComercial();
                  break;
              case 3:
                  consultarContato();
                  break;
              case 4:
                  listarContatos();
                  break;
              case 5:
                  funciona = false;
                  view.Mensagem("Saindo do programa...");
                  break;
              default:
                  view.Mensagem("Escolha inválida. Tente novamente.");
                  break;
          }
      }
  }

  private void incluirContatoPessoal() {
    int codigo = view.getInt("Digite o codigo de acesso: ");
    String nome = view.getInput("Digite o nome: ");
    String telefone = view.getInput("Digite o telefone: ");
    String aniversario = view.getInput("Digite a data de nascimento: ");
    Pessoal pessoal = new Pessoal(codigo, nome, telefone, aniversario);
    agenda.incluirPessoal(pessoal);
    view.Mensagem("Contato pessoal criado com sucesso");
}

private void incluirContatoComercial() {
    int codigo = view.getInt("Digite o codigo de acesso: ");
    String nome = view.getInput("Digite o nome: ");
    String telefone = view.getInput("Digite o telefone: ");
    String cnpj = view.getInput("Digite o cnpj: ");
    Comercial comercial = new Comercial(codigo, nome, telefone, cnpj);
    agenda.incluirComercial(comercial);
    view.Mensagem("Contato comercial criado com sucesso");
}

private void excluirContato() {
    int codigo = Integer.parseInt(view.getInput("Digite o código do contato a ser excluído: "));
    Contato contato = agenda.getContato(codigo);
    if (contato != null) {
        agenda.removerContato(contato);
        view.Mensagem("Contato excluído com sucesso.");
    } else {
        view.Mensagem("Contato não encontrado.");
    }
}

private void consultarContato() {
    int codigo = Integer.parseInt(view.getInput("Digite o código do contato: "));
    Contato contato = agenda.getContato(codigo);
    if (contato != null) {
        view.displayContatoDetalhes(contato.toString());
    } else {
        view.Mensagem("Contato não encontrado.");
    }
}

private void listarContatos() {
    for (Contato contato : agenda.getContato()) {
        view.displayContatoDetalhes(contato.toString());
    }
}
}
