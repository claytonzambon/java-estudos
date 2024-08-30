package exercicios;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("### Programa que informa se o número digitado é Positivo ou Negativo ###\n");
		
		int numeroDigitado = 1;
		
		while (numeroDigitado != 0) {
			System.out.print(">>> Informe um número inteiro Positivo ou Negativo ou digite 0 para sair: ");
			numeroDigitado = leitura.nextInt();
			
			if (numeroDigitado == 0) {
				break;
			}
			
			if (numeroDigitado > 0) {
				System.out.println("*** O número digitado é positivo *** \n");
			} else {
				System.out.println("*** O número digitado é negativo *** \n");
			}
		}
		
		System.out.println("\n>>> Fim da execução do Software <<<\n");

	}

}