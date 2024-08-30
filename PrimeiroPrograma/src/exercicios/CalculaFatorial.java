package exercicios;

import java.util.Scanner;

public class CalculaFatorial {

	public static void main(String[] args) {
		
		System.out.println("### Programa que cacula o Fatorial de um número ###");
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("*** Informe um número: ");
		int numero = leitura.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= numero ; i++) {
			fatorial *= i;
		}
		System.out.printf(">>> O Fatorial de %s é %s.", numero, fatorial);
		
		leitura.close();
	}

}
