package br.edu.up.views;

import br.edu.up.controllers.ControleEvento;
import br.edu.up.controllers.ControleReserva;
import br.edu.up.Prompt;
import br.edu.up.models.Evento;

public class MenuReserva {

    private ControleReserva controleReserva;
    private ControleEvento controleEvento;

    public MenuReserva(ControleEvento controleEvento, ControleReserva controleReserva) {
        this.controleEvento = controleEvento;
        this.controleReserva = controleReserva;
    }

    public void mostrarReserva() {
        Menu menuInicial = new Menu(controleEvento, controleReserva);
        Mensagem msg = new Mensagem();

        int escolha;

        do {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU RESERVAS");
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
                    System.out.println("--- Incluir RESERVA ---");
                    String nomeEvento = Prompt.lerLinha("Digite o nome do evento que deseja fazer a reserva: ");
                    String nome = Prompt.lerLinha("Digite o nome do responsável: ");
                    int quantidadePessoas = Prompt.lerInteiro("Digite a quantidade de pessoas da reserva: ");
                    String data = Prompt.lerLinha("Digite a data da reserva: ");

                    if (controleEvento.conferirNomeEvento(nomeEvento).equals("ok")) {
                        if (controleEvento.conferirDataEvento(data).equals("ok")) {
                            if (controleEvento.ingressosDisponiveis(nomeEvento, quantidadePessoas).equals("ok")) {
                                if (controleReserva.incluirReserva(nome, quantidadePessoas, data).equals("ok")) {
                                    msg.mensagem("Reserva realizada com sucesso!!");
                                } else {
                                    msg.mensagem("Falha ao realizar reserva[1]");
                                }
                            } else {
                                msg.mensagem("Falha ao realizar reserva[2]");
                            }
                        } else {
                            msg.mensagem("Falha ao realizar reserva[3]");
                        }
                    } else {
                        msg.mensagem("Falha ao realizar reserva[4]");
                    }
                    break;

                case 2:
                    // Adicione o código para alterar reserva aqui
                    break;

                case 3:
                    System.out.println("--- Listagem das Reservas ---");
                    for (Reserva reserva : controleReserva.listarReservas()) {
                        System.out.println(reserva);
                    }
                    break;

                case 4:
                    // Adicione o código para excluir reserva aqui
                    break;

                case 5:
                    menuInicial.mostrar();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);

        menuInicial.mostrar();
    }
}
