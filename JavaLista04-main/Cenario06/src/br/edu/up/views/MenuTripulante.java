package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;

public class MenuTripulante {
    
    public void mostrarTripulante(){
        Menu iniciar = new Menu();
        ControleTripulante ctrlTripulante = new ControleTripulante();

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
    
        int op = Prompt.lerInteiro();
        do {
            switch (op) {

                case 1:
                    System.out.println("--- Registrar Comandantes ---");
                    String nome = Prompt.lerLinha("Digite o nome do comandante: ");
                    int rg = Prompt.lerInteiro("Digite o RG: ");
                    int matriclua = Prompt.lerInteiro("Digite a matrícula do comandante: ");
                    int id = Prompt.lerInteiro("Digite o ID do comandante: ");
                    int horasVoo = Prompt.lerInteiro("Digite a quantidade de horas de voo");
                String res= ctrlTripulante.registarComandante(nome, rg, id, matriclua, horasVoo);
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
                if (ctrlTripulante.registrarComissario(nome, rg, id, matriclua, idiomas).equals("null")) {
                    System.out.println("[ERRO]");
                }else{
                    System.out.println("Cadastro realizado com sucesso!!");
                }
                break;
                case 3:
                    System.out.println(ctrlTripulante.listarTripulantes());
                    
                break;
                case 4:
                    iniciar.mostrar();
                break;
                case 5:
                    System.exit(0);
                break;
                default:
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
    
    }


    
}
