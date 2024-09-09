package exercicios_OO.listasecolecoes.contabancaria;

import java.util.ArrayList;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(100, 500.00);
		
		ContaBancaria conta2 = new ContaBancaria(105, 600.00);
		
		ContaBancaria conta3 = new ContaBancaria(110, 700.00);
		
		ContaBancaria conta4 = new ContaBancaria(115, 800.00);
		
		ContaBancaria conta5 = new ContaBancaria(120, 900.00);
		
		ArrayList<ContaBancaria> lista = new ArrayList<>();
		lista.add(conta1);
		lista.add(conta2);
		lista.add(conta3);
		lista.add(conta4);
		lista.add(conta5);
		
		ContaBancaria contaMaiorSaldo = lista.get(0);
		for (ContaBancaria contaBancaria : lista) {
			if (contaBancaria.getSaldo() > contaMaiorSaldo.getSaldo()) {
				contaMaiorSaldo = contaBancaria;
			}
		}
		
		System.out.println("Número da conta com maior saldo: " + contaMaiorSaldo.getNumero() + " Saldo: R$ " + contaMaiorSaldo.getSaldo());
	}

}