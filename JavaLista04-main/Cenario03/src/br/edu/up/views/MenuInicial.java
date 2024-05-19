package br.edu.up.views;
import br.edu.up.controllers.*;
import br.edu.up.models.*;
import br.edu.up.views.*;
import br.edu.up.Prompt;

import java.util.Scanner;

public class MenuInicial {

      Ano ano = new Ano(2024);
      AnoView view = new AnoView();


      Scanner leitor = new Scanner(System.in);
      ControleDeAgenda controller = new ControleDeAgenda(ano);

      public void mostrar() {

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Adicionar Compromisso");
        System.out.println("2. Consultar Compromisso");
        System.out.println("3. Remover Compromisso");
        System.out.println("4. Listar Compromissos");
        System.out.println();

        int opcao = leitor.nextInt();
        do {
            
            switch (opcao) {
            case 1:{
                  System.out.println("--- Adicionar Compromisso ---\n");
                  int mes = Prompt.lerInteiro("Digite o mês: ");
                  int dia = Prompt.lerInteiro("Digite o dia: ");
                  int hora = Prompt.lerInteiro("Digite a hora: ");
                  String pessoa = Prompt.lerLinha("Digite o nome da pessoa: ");
                  String local = Prompt.lerLinha("Digite o local: ");
                  String assunto = Prompt.lerLinha("Digite o assunto: ");
                  controller.addCompromisso(mes, dia, hora, pessoa, local, assunto);
                  view.mensagem(controller.addCompromisso(mes, dia,hora, pessoa, local, assunto));
            }
                  break;
            case 2:{    
                  System.out.println("--- Consultar Compromissos");
                  int mes = Prompt.lerInteiro("Digite o mês: ");
                  int dia = Prompt.lerInteiro("Digite o dia: ");
                  int hora = Prompt.lerInteiro("Digite a hora: ");
                  controller.consultarCompromisso(mes, dia, hora);
                  view.mensagem(controller.consultarCompromisso(mes, dia, hora));


            }
                  break;
             case 3:{
                  System.out.println("--- Remover Compromisso ---");
                  int mes = Prompt.lerInteiro("Digite o mês: ");
                  int dia = Prompt.lerInteiro("Digite o dia: ");
                  int hora = Prompt.lerInteiro("Digite a hora: ");
                  controller.removerCompromisso(mes, dia, hora);
                  view.mensagem(controller.removerCompromisso(mes, dia, hora));

            }
                  break; 
            case 4:{
                  mostrarListarprodutos();
            }
                  break;
            default:
                break;
            }
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU INICIAL"       );
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();

            System.out.println("1. Adicionar Compromisso");
            System.out.println("2. Consultar Compromisso");
            System.out.println("3. Remover Compromisso");
            System.out.println("4. Listar Compromissos");
            System.out.println("5. Encerrar Programa");
            System.out.println();
            opcao = leitor.nextInt();


        } while (opcao != 5);

        leitor.close();
        }
        int opcao2;
        public void mostrarListarprodutos(){
            
                 System.out.println();
                  System.out.println("-------------------------");
                  System.out.println("   Listar Compromissos   ");
                  System.out.println("-------------------------");
                  System.out.println();
                  System.out.println("Digite a opção desejada:");
            

                  System.out.println("1. Compromissos do mês ");
                  System.out.println("2. Todos os compromissos");
                  System.out.println();
                  opcao2 = leitor.nextInt();
            do {
                  switch (opcao2) {
                        case 1:{
                  
                              System.out.println("Digite o número do mês desejado: ");
                              int mes = Prompt.lerInteiro();
                              view.mensagem(controller.listarCompromissosDoMes(mes));
                              }      
                              break;
                        case 2:{
                              System.out.println("Compromissos agendados para 2024!\n");
                              view.mensagem(controller.listarTodosCompromissos());
                              }
                              break;
                        default:
                              break;
                        
                  }
                  System.out.println("-------------------------");
                  System.out.println("   Listar Compromissos   ");
                  System.out.println("-------------------------");
                  System.out.println();
                  System.out.println("Digite a opção desejada:");
                  
                  System.out.println("1. Compromissos do mês ");
                  System.out.println("2. Todos os compromissos");
                  System.out.println("3. Voltar");
                  System.out.println();
                  opcao2 = leitor.nextInt(); 
            } while (opcao2 != 3);
            
        }
        
 }