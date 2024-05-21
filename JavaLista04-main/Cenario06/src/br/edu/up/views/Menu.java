package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;
import br.edu.up.models.*;

public class Menu {

    
    Aeronave aeronave = new Aeronave();
    Data data = new Data();
    

    public void mostrar(){

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Menu Passageiros");
        System.out.println("2. Menu Tripulantes");
        System.out.println("3. Listar pessoas do Voo");
        System.out.println("4. Encerrar");
        int op = Prompt.lerInteiro();
        switch (op) {
            case 1:
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("      MENU PASSAGEIRO"    );
                System.out.println("-------------------------");
                System.out.println();
                System.out.println("Digite a opção desejada:");
                System.out.println();
            
                System.out.println("1. Cadastrar Passageiro");
                System.out.println("2. Voltar ao Menu Inicial");
                System.out.println("3. Listar Passageiros");
                System.out.println("4. Encerrar");
            
                op = Prompt.lerInteiro();
                do {
                    switch (op) {
                        case 1:
                            System.out.println("-- Registar Passageiro --");
                           
                            String nome = Prompt.lerLinha("Digite o nome do passageiro: ");
                            int rg = Prompt.lerInteiro("Digite o RG do passageiro: ");
                            int idBagagem = Prompt.lerInteiro("Digie o ID da bagagem: ");
                            String acento = Prompt.lerLinha("Digite o seu acento: ");
                            String classe = Prompt.lerLinha("Digite a classe do acento: ");
                            String res = Banco.ctrlPassageiro.adicionarPassageiro(nome, rg, idBagagem, acento, classe);
                            if (res.equals("null")) {
                                System.out.println("[ERRO]");
                            }else{
                                System.out.println(res);
                            }
                            break;
                        case 2:
                            mostrar();
                            break;
                        case 3:
                            System.out.println(Banco.ctrlPassageiro.listarPassageiros());
                        break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida!!");
                            break;
                    } 
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("      MENU PASSAGEIRO"    );
                System.out.println("-------------------------");
                System.out.println();
                System.out.println("Digite a opção desejada:");
                System.out.println();
                
                System.out.println("1. Cadastrar Passageiro");
                System.out.println("2. Voltar ao Menu Inicial");
                System.out.println("3. Listar todas as pessoas do voo");
                System.out.println("4. Encerrar");
            
                op = Prompt.lerInteiro();
                } while (op != 4);
                System.exit(0);
            break;
            case 2:
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("      MENU TRIPULANTE"    );
                System.out.println("-------------------------");
                System.out.println();
                System.out.println("Digite a opção desejada:");
                System.out.println();
            
                System.out.println("1. Comandantes");
                System.out.println("2. Comissários");
                System.out.println("3. Listar Tripulantes");
                System.out.println("4. Voltar ao Menu Inicial");
                System.out.println("5. Encerrar");
            
                op = Prompt.lerInteiro();
                do {
                    switch (op) {
        
                        case 1:
                            System.out.println("--- Registrar Comandantes ---");
                            String nome = Prompt.lerLinha("Digite o nome do comandante: ");
                            int rg = Prompt.lerInteiro("Digite o RG: ");
                            int matriclua = Prompt.lerInteiro("Digite a matrícula do comandante: ");
                            int id = Prompt.lerInteiro("Digite o ID do comandante: ");
                            int horasVoo = Prompt.lerInteiro("Digite a quantidade de horas de voo");
                        String res= Banco.ctrlTripulante.registarComandante(nome, rg, id, matriclua, horasVoo);
                        if (res == "null") {
                            System.out.println("[ERRO]");
                        }else{
                            System.out.println(res);
                        }
                        break;
        
                        case 2:
                        System.out.println("--- Registrar Comissários ---");
                            nome = Prompt.lerLinha("Digite o nome do comissário: ");
                            rg = Prompt.lerInteiro("Digite o RG: ");
                            matriclua = Prompt.lerInteiro("Digite a matrícula do comissário: ");
                            id = Prompt.lerInteiro("Digite o ID do comissário: ");
                            String idiomas = Prompt.lerLinha("Digite os idiomas falados pelo comissário: ");
                        if (Banco.ctrlTripulante.registrarComissario(nome, rg, id, matriclua, idiomas).equals("null")) {
                            System.out.println("[ERRO]");
                        }else{
                            System.out.println("Cadastro realizado com sucesso!!");
                        }
                        break;
                        case 3:
                            System.out.println(Banco.ctrlTripulante.listarTripulantes());
                            
                        break;
                        case 4:
                            mostrar();
                        break;
                        case 5:
                            System.exit(0);
                        break;
                        default:
                            System.out.println("Opção inválida!!");
                        break;
                    }
                    System.out.println();
                    System.out.println("-------------------------");
                    System.out.println("      MENU TRIPULANTE"    );
                    System.out.println("-------------------------");
                    System.out.println();
                    System.out.println("Digite a opção desejada:");
                    System.out.println();
                
                    System.out.println("1. Comandantes");
                    System.out.println("2. Comissários");
                    System.out.println("3. Listar Tripulantes");
                    System.out.println("4. Voltar ao Menu Inicial");
                    System.out.println("5. Encerrar");
                
                    op = Prompt.lerInteiro();
            
                } while (op != 5);
            break;
            case 3:
                System.out.println("--- Lista das pessoas do Voo ---");
                System.out.println("\nAeronave: \nModelo: "+ aeronave.getTipo()+"\nQuantidade de assentos: "+ aeronave.getQuantAssentos()+"\nCódigo de Voo: "+aeronave.getCodigo());
                System.out.println("\nData do voo:  "+data.getDia()+"/"+data.getMes()+"/"+data.getAno()+" as "+data.getHora()+":"+data.getMinuto());
                System.out.println("\n\n--- Passageiros ---");
                System.out.println(Banco.ctrlPassageiro.listarPassageiros());
                System.out.println("\n\n--- Tripulação ---");
                System.out.println(Banco.ctrlTripulante.listarTripulantes());
            break;
            case 4:
                System.exit(0);
            break;
            default:
                System.out.println("Opção inválida!!");
            break;
        }
    }
}

