package br.com.marcusroggero;

import java.util.Scanner;

public class MenuSwitch {

	public final static int CADASTRO_PRODUTO 			= 1;
	public final static int EMISSAONOTA 		= 2;
	public final static int CANCELARCOMPRA		= 3;
	public final static int EFETUARVENDA 		= 4;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu principal");
		System.out.println("1- Cadastro de produtos");
		System.out.println("2- Emitir nota fiscal");
		System.out.println("3- Cancelar compra");
		System.out.println("4- Efetuar venda");

		System.out.println("Digite a opção desejada");

		int opcaoEscolhida = entrada.nextInt();

		switch (opcaoEscolhida) {

		case CADASTRO_PRODUTO:
			System.out.println("Cadastro de produtos");
			break;

		case EMISSAONOTA:
			System.out.println("Emitir nota fiscal");
			break;

		case CANCELARCOMPRA:
			System.out.println("Cancelar compra");
			break;

		case EFETUARVENDA:
			System.out.println("Efetuar venda");
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}

	}

}
