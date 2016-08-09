package br.com.marcusroggero;

import java.util.Scanner;

public class AdivinhacaoNumero {

	public static void main(String[] args) {

		System.out.println("Digite o número escolhido (número inteiro)");
		Scanner entrada = new Scanner(System.in);
		int numeroEscolhido = entrada.nextInt();
		
		int chuteNumero = numeroEscolhido + 1;
		int numeroTentativas = 0;

		while (chuteNumero != numeroEscolhido) {

			System.out.println("Digite seu chute (número inteiro)");
			entrada = new Scanner(System.in);
			chuteNumero = entrada.nextInt();

			if (chuteNumero > numeroEscolhido) {

				System.out.println("Chute maior");
				numeroTentativas = numeroTentativas + 1;

			} else if (chuteNumero < numeroEscolhido) {

				System.out.println("Chute menor");
				numeroTentativas = numeroTentativas + 1;

			} else {

				numeroTentativas = numeroTentativas + 1;
				System.out.println("Acertou em " + numeroTentativas + " tentativas.");

			}

		}

	}

}
