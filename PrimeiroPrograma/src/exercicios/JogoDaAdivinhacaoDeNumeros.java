package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacaoDeNumeros {

	public static void main(String[] args) {
		
		System.out.println(">>> Jodo da Adivinhação de números <<<");
		System.out.println();
		System.out.println("Você tem 5 tentativas para adivinhar o número entre 0 e 100");
		System.out.println();
		
		Scanner leitura = new Scanner(System.in);
		
		int numeroSecreto = new Random().nextInt(100);
		int numeroInformadoPeloUsuario = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("#%s Tentativa -> Informe um número: ", i + 1);
			numeroInformadoPeloUsuario = leitura.nextInt();
						
			if (numeroInformadoPeloUsuario == numeroSecreto) {
				System.out.printf("\n###  O número secreto era %s, Parabéns você acertou ###\n", numeroSecreto);
				break;
			}
			
			if (numeroInformadoPeloUsuario > numeroSecreto) {
				System.out.println("*** O número informado é maior que o número secreto ***\n");
			}
			
			if (numeroInformadoPeloUsuario < numeroSecreto) {
				System.out.println("*** O número informado é menor que o número secreto ***\n");
			}
			
			if (i == 4) {
				System.out.println("\n--- Acabaram suas tentativas ---\n");
			}
		}
		
		System.out.println(">>> Fim da execução do Software<<<");
		
	}

}
