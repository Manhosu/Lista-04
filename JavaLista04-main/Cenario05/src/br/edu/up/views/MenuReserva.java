package br.edu.up.views;

import br.edu.up.controllers.ControleEvento;
import br.edu.up.controllers.ControleReserva;
import br.edu.up.Prompt;
import br.edu.up.Prompt;
import br.edu.up.controllers.ControleReserva;
import br.edu.up.Prompt;
import br.edu.up.models.Evento;

public class MenuReserva {
    public void mostrarReserva(){
     
    ControleReserva controllReserva = new ControleReserva();
    ControleEvento controleEvento = new ControleEvento();
    Menu menuInicial = new Menu();
    Mensagem msg = new Mensagem();

    int escolha;

  
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU RESERVAS"       );
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
        do {
            switch(escolha){
                case 1:
                    System.out.println("--- Incluir RESERVA---");
                    String nomeEvento = Prompt.lerLinha("Digite o nome do evento que deseja fazer a reserva: ");
                    String nome = Prompt.lerLinha("Digite o nome do responsável: ");
                    int quantidadePessoas = Prompt.lerInteiro("Digite a quantidade de pessoas da reserva: ");
                    String data = Prompt.lerLinha("Digite a data da reserva: ");
                    if (!controleEvento.conferirNomeEvento(nomeEvento).equals("ok")&& !controleEvento.conferirDataEvento(data).equals("ok")) {
                        if (!controleEvento.ingressosDisponiveis(nome, quantidadePessoas).equals("ok")) {
                            if (controllReserva.incluirReserva( nome, quantidadePessoas, data).equals("ok")) {
                                msg.mensagem("Reserva realizada com suscesso!!");
                            }else{
                                msg.mensagem("Falha ao realizar reserva[1]");
                            }    
                        }else{
                            msg.mensagem("Falha ao realizar reserva[2]");
                        }
                    }else{
                        msg.mensagem("Falha ao realizar reserva[3]");
                    }
                    
                break;
                case 5:
                    menuInicial.mostrar();
                break;
            }
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU RESERVAS"       );
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
        } while ( escolha != 5);
        menuInicial.mostrar();
    }
}
