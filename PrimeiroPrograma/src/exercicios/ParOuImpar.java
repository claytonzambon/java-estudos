package exercicios;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		System.out.println("### Verifica se o número é Par ou Ímpar ###\n");
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("*** Informe um número: ");
		double numero = leitura.nextDouble();
		
		if (numero % 2 == 0) {
			System.out.println(">>> O número informado é par <<<");
		} else {
			System.out.println(">>> o número informado é ímpar <<<\n");
		}
		
		leitura.close();
		System.out.println("--- Fim da execução do Software ---");
	}

}
