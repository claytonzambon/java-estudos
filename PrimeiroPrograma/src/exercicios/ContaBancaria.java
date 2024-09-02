package exercicios;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		System.out.println("### Programa que simula uma Conta Bancária ###\n");
		Scanner leitura = new Scanner(System.in);

		String nomeCliente = "Peter Parker";
		String tipoConta = "Conta Corrente";
		double saldo = 2500.00;
		
		System.out.println("#############################");
		System.out.println("# Dados iniciais do Cliente #\n");
		System.out.println("# Nome: " + nomeCliente );
		System.out.println("# Tipo conta: " + tipoConta);
		System.out.println("# Saldo inicial: R$ " + saldo);
		System.out.println("#############################\n");
		
		String menu = """
				** Operações **
				* 1 - Consultar saldos
				* 2 - Receber valor
				* 3 - Transferir valor
				* 4 - Sair
				* Digite a opção desejada ->
				""";
		
		int opcao = 0;
		while (opcao != 4) {
			System.out.print(menu);
			opcao = leitura.nextInt();
			
			if (opcao == 1) {
				System.out.printf(">>> O saldo atual é de R$ %.2f <<<\n", saldo);
			}
			if (opcao == 2) {
				System.out.print(">>> Informe o valor a receber: R$ ");
				double receber = leitura.nextDouble();
				saldo += receber;
			}
			if (opcao == 3) {
				System.out.print(">>> Informe o valor a ser transferido: R$ ");
				double valorTransferir = leitura.nextDouble();
				if (valorTransferir > saldo) {
					System.out.println("!!! Saldo insuficiente para efetuar a transferência !!!");
				} else {
					saldo -= valorTransferir;
				}
			}
		}
		
		leitura.close();
		System.out.println("\n\n--- Fim da execução do Software ---");
	}

}