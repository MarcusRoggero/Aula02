package br.com.marcusroggero;
import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		int numeroDigitado = 0;
				
		while (true) {
			
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
				
		try {
			
			numeroDigitado = entrada.nextInt();
			
			if (numeroDigitado%2 == 0) {
				
				System.out.println("� par");
				
			} else {
				
				System.out.println("� impar");
				
			}
			
			break;
			
		} catch (Exception erro) {
			
			//erro.printStackTrace();
			System.out.println("Favor digitar n�mero inteiro");
			
		}
		
		}
				
	}
}
