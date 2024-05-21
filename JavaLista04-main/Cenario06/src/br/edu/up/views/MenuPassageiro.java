package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.ControlePassageiro;

public class MenuPassageiro {
    public void mostrarPassageiro(){

        Menu iniciar = new Menu();
        ControlePassageiro passageiro = new ControlePassageiro();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU PASSAGEIRO"    );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1. Cadastrar Passageiro");
        System.out.println("2. Voltar ao Menu Inicial");
        System.out.println("3. Encerrar");
    
    
    
        int op = Prompt.lerInteiro();
        do {
            switch (op) {
                case 1:
                    // System.out.println("---Informe os dados do passageiro---");
                    // String nome = Prompt.lerLinha("Nome: ");
                    // int rg = Prompt.lerInteiro("Rg:");
                    // int idBagagem = Prompt.lerInteiro("ID Bagagem: ");
                    // String res = passageiro.adicionarPassageiro(nome, rg, idBagagem);
                    // if (res == "null") {
                    //     System.out.println("[ERRO]");
                    // }else{
                    //     System.out.println(res);
                    // }
                    break;
                case 2:
                    iniciar.mostrar();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
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
            System.out.println("3. Encerrar");
    
            op = Prompt.lerInteiro();
        } while (op != 3);
        System.exit(0);
        }
    
}
