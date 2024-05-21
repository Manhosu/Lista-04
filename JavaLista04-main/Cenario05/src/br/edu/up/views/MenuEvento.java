package br.edu.up.views;

import br.edu.up.controllers.ControleEvento;
import br.edu.up.Prompt;

public class MenuEvento {

    private ControleEvento controllerEvento;

    public MenuEvento(ControleEvento controllerEvento) {
        this.controllerEvento = controllerEvento;
    }

    public void mostrarEvento() {
        int escolha;

        do {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU EVENTOS");
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();
            System.out.println("1. Incluir");
            System.out.println("2. Alterar");
            System.out.println("3. Listar");
            System.out.println("4. Excluir");
            System.out.println("5. Voltar");

            escolha = Prompt.lerInteiro();

            switch (escolha) {
                case 1:
                    System.out.println("--- Incluir EVENTO ---");
                    String nome = Prompt.lerLinha("Nome: ");
                    String data = Prompt.lerLinha("Data: ");
                    String local = Prompt.lerLinha("Local: ");
                    int lotacaoMax = Prompt.lerInteiro("Lotação máxima: ");
                    double precoIngresso = Prompt.lerDecimal("Preço do ingresso: ");
                    if (controllerEvento.incluirEvento(nome, data, local, lotacaoMax, precoIngresso).equals("ok")) {
                        System.out.println("Evento adicionado com sucesso!");
                    } else {
                        System.out.println("Falha ao adicionar evento!");
                    }
                    break;
                case 2:
                    // Adicione o código para alterar evento aqui
                    break;
                case 3:
                    System.out.println("--- Listagem dos Eventos ---");
                    for (Evento evento : controllerEvento.listagemDeEventos()) {
                        System.out.println(evento);
                    }
                    break;
                case 4:
                    // Adicione o código para excluir evento aqui
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
    }
}
