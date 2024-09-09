package exercicios_OO.listasecolecoes.contabancaria;

public class ContaBancaria {
	private int numero;
	private double saldo;
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
}
