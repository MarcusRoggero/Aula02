package br.com.marcusroggero;

import java.util.Scanner;

public class MenuSwitch {

	public final static int CADASTRO_PRODUTO	= 1;
	public final static int EMISSAO_NOTA 		= 2;
	public final static int CANCELAR_COMPRA		= 3;
	public final static int EFETUAR_VENDA 		= 4;

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

		case EMISSAO_NOTA:
			System.out.println("Emitir nota fiscal");
			break;

		case CANCELAR_COMPRA:
			System.out.println("Cancelar compra");
			break;

		case EFETUAR_VENDA:
			System.out.println("Efetuar venda");
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}

	}

}
