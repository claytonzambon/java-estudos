package appcompras;

import java.util.Collections;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("*** App de Compras ***");
		System.out.print("## Informe o limite do Cartão de crédito: ");
		double limite = leitura.nextDouble();
		CartaoDeCredito cartao = new CartaoDeCredito(limite);
		
		int opcao = 1;
		while (opcao != 0) {
			System.out.println("\n##################################");
			System.out.print("### Informe a descrição da compra: ");
			String descricao = leitura.next();
			
			System.out.print("### Informe o valor da compra: ");
			double valor = leitura.nextDouble();
			System.out.println("##################################");
			
			Compra compra = new Compra(descricao, valor);
			boolean compraRealizada = cartao.adicionaCompra(compra);
			
			if (compraRealizada) {
				System.out.println("--- Compra Efetuada ---");
				System.out.print("--- Digite 0 para sair ou 1 para continuar: ");
				opcao = leitura.nextInt();
			} else {
				System.out.println("--- Saldo Insuficiente ---");
				opcao = 0;
			}
		}
		
		System.out.println("**************************");
		System.out.println("*** Compras Realizadas ***:\n");
		Collections.sort(cartao.getCompras());
		for (Compra item : cartao.getCompras()) {
			System.out.println(item.getDescricao() + " - R$ " + item.getValor());
		}
		System.out.println("**************************");
		System.out.println("\nSaldo do Cartão: " + cartao.getSaldo());
		
		leitura.close();
	}

}