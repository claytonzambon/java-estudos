package exercicios;

import java.util.Scanner;

public class TabuadaDeUmNumero {

	public static void main(String[] args) {
		
		System.out.println("### Programa que exibe a Tabuada do número informado ###\n");
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("*** Informe um número: ");
		double numero = leitura.nextDouble();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s x %s = %s\n", numero, i, numero * i);
		}
		
		leitura.close();
		System.out.println("--- Fim da execução do Software ---");
	}

}