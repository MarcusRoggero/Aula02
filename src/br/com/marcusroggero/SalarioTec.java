package br.com.marcusroggero;

import java.util.Scanner;

public class SalarioTec {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome do funcionário: ");
		String nomeFunc = entrada.nextLine();
		
		System.out.println("Salario: ");
		double salarioFunc = Double.parseDouble(entrada.nextLine());

		System.out.println("Area: ");
		String areaFunc = entrada.nextLine();
		
		if (areaFunc.equals("Tecnologia")) {
			
			System.out.println("O salario de " + nomeFunc + " é: "+ 1.1*salarioFunc);
			
		} else {
			
			System.out.println("O salario de " + nomeFunc + " é: "+ salarioFunc);		
			
		}
		
	}

}
