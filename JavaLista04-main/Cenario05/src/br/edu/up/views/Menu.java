package br.edu.up.views;

import javax.swing.text.View;
import javax.xml.crypto.Data;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;


public class Menu {

    public void mostrar(){

        MenuEvento eventoMenu = new MenuEvento();
        MenuReserva eventoReserva = new MenuReserva();
        ControleEvento controllerEvento = new ControleEvento();
        ControleReserva controllReserva = new ControleReserva();
        Mensagem msg = new Mensagem();

        int escolha;

        do {
            
        
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1. Eventos ");
        System.out.println("2. Reservas ");
        System.out.println("3. Encerrar");
  
   
        escolha = Prompt.lerInteiro();
        switch (escolha) 
        {
            case 1:
            {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU EVENTOS"       );
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
                switch (escolha) {
                    case 1:
                        System.out.println("--- Incluir EVENTO ---");
                        String nome = Prompt.lerLinha("Nome: ");
                        String data = Prompt.lerLinha("Data: ");
                        String local = Prompt.lerLinha("Local: ");
                        int lotacaoMax = Prompt.lerInteiro("Lotação máxima: ");
                        Double precoIngresso = Prompt.lerDecimal("Preço do ingresso: ");
                        if (controllerEvento.validarData(data).equals("true")) {
                            if (controllerEvento.incluirEvento(nome, data, local, lotacaoMax, precoIngresso).equals("null")) {
                            System.out.println("Falha ao adicionar evento!!");
                            }else{
                            System.out.println("Evento adicionada com suscesso!!");
                            }
                        }
                          
                        break;
                    case 2:
                        System.out.println("-------------------------");
                        System.out.println("    MENU DE ALTERAÇÃO"    );
                        System.out.println("-------------------------");
                        System.out.println();
                        System.out.println("Digite oque deseja alterar:");
                        System.out.println();
                    
                        System.out.println("1. Nome");
                        System.out.println("2. Local");
                        System.out.println("3. Data");
                        System.out.println("4. Lotação Máxima");
                        System.out.println("5. Preço do Ingresso");
                        System.out.println("6. Voltar");
                        do {
                            escolha = Prompt.lerInteiro();
                            switch (escolha) {
                                case 1:
                                    System.out.println("--- Alterar Nome ---");
                                    String nomeAntigo = Prompt.lerLinha("Digite o nome que deseja mudar: ");
                                    String nomeNovo = Prompt.lerLinha("Digite o nome novo: ");
                                    if (controllerEvento.alterarNomeEvento(nomeAntigo, nomeNovo).equals("null")) {
                                        System.out.println("Falha ao alterar nome do evento!!");
                                    }else{
                                        System.out.println("Nome do evento alterado com suscesso!!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("--- Alterar Local ---");
                                    String localAntigo = Prompt.lerLinha("Digite o local que deseja mudar: ");
                                    String localNovo = Prompt.lerLinha("Digite o local novo: ");
                                    if (controllerEvento.alterarLocalEvento(localAntigo, localNovo).equals("null")) {
                                        System.out.println("Falha ao alterar local do evento!!");
                                    }else{
                                        System.out.println("Local do evento alterado com suscesso!!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("--- Alterar Data ---");
                                    String dataAntigo = Prompt.lerLinha("Digite a data que deseja mudar: ");
                                    String dataNovo = Prompt.lerLinha("Digite a data novo: ");
                                    if (controllerEvento.alterarDataEvento(dataAntigo, dataNovo).equals("null")) {
                                        System.out.println("Falha ao alterar data do evento!!");
                                    }else{
                                        System.out.println("Data do evento alterado com suscesso!!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("--- Alterar Lotação ---");
                                    int lotacaoAntigo = Prompt.lerInteiro("Digite a lotação que deseja mudar: ");
                                    int lotacaoNovo = Prompt.lerInteiro("Digite a lotação novo: ");
                                    if (controllerEvento.alterarLotacaoEvento(lotacaoAntigo, lotacaoNovo).equals("null")) {
                                        System.out.println("Falha ao alterar lotação do evento!!");
                                    }else{
                                        System.out.println("Lotação do evento alterado com suscesso!!");
                                    }
                                    break;
                                case 5:
                                    System.out.println("--- Alterar Preço do Ingresso ---");
                                    int precoAntigo = Prompt.lerInteiro("Digite o preço do ingresso que deseja mudar: ");
                                    int precoNovo = Prompt.lerInteiro("Digite o preço do ingresso novo: ");
                                    if (controllerEvento.alterarPrecoEvento(precoAntigo, precoNovo).equals("null")) {
                                        System.out.println("Falha ao alterar o preço do ingresso do evento!!");
                                    }else{
                                        System.out.println("Preço do ingresso do evento alterado com suscesso!!");
                                    }
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("-------------------------");
                            System.out.println("    MENU DE ALTERAÇÃO"    );
                            System.out.println("-------------------------");
                            System.out.println();
                            System.out.println("Digite oque deseja alterar:");
                            System.out.println();
                        
                            System.out.println("1. Nome");
                            System.out.println("2. Local");
                            System.out.println("3. Data");
                            System.out.println("4. Lotação Máxima");
                            System.out.println("5. Preço do Ingresso");
                            System.out.println("6. Voltar");
                        } while (escolha != 6);
                        
                        break;
                    case 3:
                        {System.out.println("--- Listagem dos Eventos ---");
                        System.out.println(controllerEvento.listagemDeEventos());
                        break;}
                        
                    case 4:
                        System.out.println("--- Excluir Evento ---");
                        nome = Prompt.lerLinha("Nome: ");
                        data = Prompt.lerLinha("Data: ");
                        local = Prompt.lerLinha("Local: ");
                        if (controllerEvento.excluirEvento(nome, data, local).equals("ok")) {
                            System.out.println("Evento excluído com suscesso!!");
                        }else{
                            System.out.println("Erro ao excluir evento!!");
                        }
                case 5:
                    System.out.println();
                    System.out.println("-------------------------");
                    System.out.println("      MENU INICIAL"       );
                    System.out.println("-------------------------");
                    System.out.println();
                    System.out.println("Digite a opção desejada:");
                    System.out.println();
                
                    System.out.println("1. Eventos ");
                    System.out.println("2. Reservas ");
                    System.out.println("3. Encerrar");
            
            
                    escolha = Prompt.lerInteiro();
                break;
                default:

                break;
            
                } 
                System.out.println("-------------------------");
                System.out.println("      MENU EVENTOS"       );
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
            
                }while (escolha != 5);
            }break;
            case 2:{
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
                            if (controllerEvento.conferirNomeEvento(nomeEvento).equals("ok")&& controllerEvento.conferirDataEvento(data).equals("ok")) {
                                if (controllerEvento.verificarEAtualizarIngressos(nomeEvento, quantidadePessoas) == 1) {
                                    double valorIngresso = controllerEvento.pegarValorIngresso(nomeEvento);
                                    if (controllReserva.incluirReserva( nome, quantidadePessoas, data, nomeEvento, valorIngresso).equals("ok")) {
                                    msg.mensagem("Reserva realizada");
                                    }else{
                                    msg.mensagem("Falha na reserva");
                                    } 
                                }else{
                                    msg.mensagem("Sem ingressos disponiveis para tal quantidade");
                                } 
                            }else{
                                msg.mensagem("Dados incorretos ou faltando");
                            }
                            
                        break;
                        case 2:
                            System.out.println("-------------------------");
                            System.out.println("    MENU DE ALTERAÇÃO"    );
                            System.out.println("-------------------------");
                            System.out.println();
                            System.out.println("Digite oque deseja alterar:");
                            System.out.println();
                        
                            System.out.println("1. Nome do responsável");
                            System.out.println("2. Quantidade de pessoas");
                            System.out.println("3. Voltar");
                            do {
                                escolha = Prompt.lerInteiro();
                                switch (escolha) {
                                    case 1:
                                        System.out.println("--- Alterar Nome ---");
                                        String nomeAntigo =Prompt.lerLinha("Digite o nome do responsável antigo: ");
                                        String nomeNovo = Prompt.lerLinha("Digite o nome do repsonsável novo: ");
                                        if (controllReserva.alterarNomeResponsavel(nomeAntigo, nomeNovo).equals("ok")) {
                                            msg.mensagem("Nome alterado com suscesso!!");
                                        }else{
                                            msg.mensagem("Falha ao alterar nome!!");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("--- Alterar Quantidade de Pessoas ---");
                                        int qtdAntigo = Prompt.lerInteiro("Digite a quantidade de pessoas antiga: ");
                                        int qtdNovo = Prompt.lerInteiro("Digite a quantidade de pessoas nova: ");
                                        nomeAntigo = Prompt.lerLinha("Digite o nome do responsável: ");
                                        if (controllReserva.alterarQuantidadePessoas(qtdAntigo, qtdNovo).equals("ok")) {
                                            for(int i=0; i< controllReserva.getReservas().length; i++){
                                                if ( controllReserva.getReservas(i) != null && controllReserva.getReservas(i).getNome().equals(nomeAntigo)) {
                                                    controllerEvento.retornarIngressos(controllReserva.getReservas(i).getNomeEvento(), (qtdAntigo-qtdNovo));
                                                }
                                            }
                                            msg.mensagem("Quantidade de pessoas alterada com suscesso!!");
                                        }else{
                                            msg.mensagem("Falha ao alterar quantidade de pessoas!!");
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            System.out.println("-------------------------");
                            System.out.println("    MENU DE ALTERAÇÃO"    );
                            System.out.println("-------------------------");
                            System.out.println();
                            System.out.println("Digite oque deseja alterar:");
                            System.out.println();
                        
                            System.out.println("1. Nome do responsável");
                            System.out.println("2. Quantidade de pessoas");
                            System.out.println("3. Voltar");
                            } while (escolha != 3);
                        break;
                        case 3:
                        msg.mensagem(controllReserva.listarReservas());    
                        break;

                        case 4:
                        System.out.println("--- Excluir Reserva ---");
                        nome = Prompt.lerLinha("Nome do responsável da reserva: ");
                        int qtd = Prompt.lerInteiro("Quantidade de pessoas na reserva: ");
                        nomeEvento = Prompt.lerLinha("Nome do Evento: ");
                        String dataEvento = Prompt.lerLinha("Data da reserva: ");
                        if (controllReserva.removerReserva(nomeEvento, nome, dataEvento, qtd).equals("ok")) {
                            controllerEvento.retornarIngressos(nomeEvento, qtd);
                            System.out.println("Reserva excluída com suscesso!!");
                        }else{
                            System.out.println("Erro ao excluir reserva!!");
                        }
                         
                        break;
                        case 5:
                            System.out.println();
                            System.out.println("-------------------------");
                            System.out.println("      MENU INICIAL"       );
                            System.out.println("-------------------------");
                            System.out.println();
                            System.out.println("Digite a opção desejada:");
                            System.out.println();
                        
                            System.out.println("1. Eventos ");
                            System.out.println("2. Reservas ");
                            System.out.println("3. Encerrar");
                    
                    
                            escolha = Prompt.lerInteiro();
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
            }break;
            case 3:{
                System.exit(0);
            }
            break; 
            default: 
            break;
            }
        } while (escolha != 3);
    }
}