package br.edu.up;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompt {
	public static void imprimir(String mensagem) {
		System.out.println(mensagem);
		System.out.flush();
	}

	public static void imprimir(Object object) {
		System.out.println(object);
		System.out.flush();
	}

	public static void separador() {
		imprimir("---------------------------------------------------");
	}
	public static void linhaEmBranco() {
		System.out.println();
		System.out.flush();
	}
	public static String lerLinha(String mensagem) {
		imprimir(mensagem);
		return lerLinha();
	}

	
	public static String lerLinha() {
		while (true) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				return br.readLine();
			} catch (IOException e) {
				System.out.println("Texto inválido, digite novamente...");
			}
		}
	}

	
	public static int lerInteiro(String mensagem) {
		imprimir(mensagem);
		return lerInteiro();
	}

	
	public static int lerInteiro() {
		while (true) {
			try {
				String linha = lerLinha();
				if (linha.isEmpty()) {
					return 0;
				}
				return Integer.parseInt(linha);
			} catch (NumberFormatException tExcept) {
				System.out.println("Inteiro inválido, digite novamente...");
			}
		}
	}

	
	public static double lerDecimal(String mensagem) {
		imprimir(mensagem);
		return lerDecimal();
	}

	
	public static double lerDecimal() {
		while (true) {
			try {
				String linha = lerLinha();
				if (linha.isEmpty()) {
					return 0;
				}
				return Double.parseDouble(linha);
			} catch (NumberFormatException e) {
				System.out.println("Decimal inválido, digite novamente...");
			}
		}
	}
	public static void pressionarEnter() {
		System.out.print("Pressione ENTER para continuar...");
		lerLinha();
	}
}
