package br.edu.up.view;

import java.util.Scanner;

public class ContatoView {
    private Scanner scanner;

    public ContatoView() {
        scanner = new Scanner(System.in);
    }

    public void Menu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Consultar um contato pelo código");
        System.out.println("4. Listar todos os contatos");
        System.out.println("5. Sair do programa");
        System.out.print("Digite sua escolha: ");
    }

    public int getEscolha() {
        return scanner.nextInt();
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
    public int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
  }

    public void Mensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void displayContatoDetalhes(String detalhes) {
        System.out.println(detalhes);
    }
}
