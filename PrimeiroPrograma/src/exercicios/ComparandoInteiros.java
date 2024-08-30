package exercicios;

import java.util.Scanner;

public class ComparandoInteiros {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("### Programa que compara dois números inteiros digitados ###\n");
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		
		while (primeiroNumero != 0 && segundoNumero != 0) {
			System.out.print("\n*** Informe o Primeiro número ou 0 para sair: ");
			primeiroNumero = leitura.nextInt();
			System.out.print("*** Informe o Segundo número ou 0 para sair: ");
			segundoNumero = leitura.nextInt();
			
			if (primeiroNumero == segundoNumero) {
				System.out.println(">>> O números digitados são iguais <<<");
			}
			if (primeiroNumero != segundoNumero) {
				System.out.println(">>> Os números digitados são diferentes <<<");
			}
			if (primeiroNumero > segundoNumero) {
				System.out.println(">>> O primeiro número é maior que o segundo <<<");
			}
			if (primeiroNumero < segundoNumero) {
				System.out.println(">>> O primeiro número é menor que o segundo <<<");
			}
		}
		
		System.out.println("\n--- Fim da execução do Software ---\n");

	}

}
