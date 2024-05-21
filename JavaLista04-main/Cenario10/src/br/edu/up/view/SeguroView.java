package br.edu.up.view;

import java.util.Scanner;

public class SeguroView {
    private Scanner scanner;

    public SeguroView() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1.Incluir seguro");
        System.out.println("2.Localizar seguro");
        System.out.println("3.xcluir seguro");
        System.out.println("4.Excluir todos os seguros");
        System.out.println("5.Listar todos os seguros");
        System.out.println("6.Ver quantidade de seguros");
        System.out.println("7Sair");
    }

    public int obterEscolhaUsuario() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public int obterNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public double obterDouble(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public boolean obterBoolean(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextBoolean();
    }

    public String obterEntrada(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirDetalhesSeguro(String detalhes) {
        System.out.println(detalhes);
    }

    public boolean confirmarExclusao() {
        System.out.print("Tem certeza que deseja excluir todos os seguros: ");
        return scanner.nextBoolean();
    }
}
