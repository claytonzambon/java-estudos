package exercicios_OO.heranca.contabancaria;

public class ContaCorrente extends ContaBancaria {

	private double tarifaMensal = 2.00;
	
	public void cobrarTarifaMensal() {
		saldo -= tarifaMensal;
		System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
	}
}
