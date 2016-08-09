package br.com.marcusroggero;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Bem-vindo " + nome);
		
	}

}
