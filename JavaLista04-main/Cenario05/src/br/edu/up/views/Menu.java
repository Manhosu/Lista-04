package br.edu.up.views;

import br.edu.up.controllers.ControleEvento;
import br.edu.up.controllers.ControleReserva;
import br.edu.up.Prompt;

public class Menu {

    private ControleEvento controllerEvento;
    private ControleReserva controllerReserva;

    public Menu(ControleEvento controllerEvento, ControleReserva controllerReserva) {
        this.controllerEvento = controllerEvento;
        this.controllerReserva = controllerReserva;
    }

    public void mostrar() {
        int escolha;

        do {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU INICIAL");
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();
            System.out.println("1. Eventos");
            System.out.println("2. Reservas");
            System.out.println("3. Encerrar");

            escolha = Prompt.lerInteiro();
            switch (escolha) {
                case 1:
                    new MenuEvento(controllerEvento).mostrarEvento();
                    break;
                case 2:
                    new MenuReserva(controllerEvento, controllerReserva).mostrarReserva();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 3);
    }
}
