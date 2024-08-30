package exercicios;

import java.util.Scanner;

public class CalcularAreaQuadradoAreaCirculo {

	public static void main(String[] args) {
		
		System.out.println("### Programa para Calcular a Área do Quadrado ou do Círculo ###\n");
		
		Scanner leitura = new Scanner(System.in);
		
		int opcao = 0;
		
		while (opcao != -1) {
			System.out.println("*** Abaixo as opções de cálculo disponíveis ***");
			System.out.println("*** 1. Calcular a área do quadrado ");
			System.out.println("*** 2. Calcular a área do círculo");
			System.out.println("*** Digite -1 para sair");
			System.out.print("*** Informe a opção desejada ->:");
			opcao = leitura.nextInt();
			if (opcao == -1) {
				break;
			}
			
			if (opcao == 1) {
				System.out.print("\nInforme a medida dos lados do quadrado: ");
				double medidaLado = leitura.nextDouble();
				double areaQuadrado = medidaLado * medidaLado;
				System.out.printf("A área do quadrado informado é %.2f\n\n", areaQuadrado);
			}
			
			if (opcao == 2) {
				System.out.print("\nInforme a medida do raio do círculo: ");
				double raio = leitura.nextDouble();
				double areaCirculo = Math.PI * Math.pow(raio, 2);
				System.out.printf("A área do círculo informado é %.2f\n\n", areaCirculo);
			}
			
		}
		
		
		leitura.close();
		System.out.println("\n--- Fim da execução do Software ---\n");
	}

}
