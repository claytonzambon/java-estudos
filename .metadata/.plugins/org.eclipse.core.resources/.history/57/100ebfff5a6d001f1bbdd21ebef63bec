package exercicios_OO.carro;

public class Carro {

	private String modelo;
	private double precoAno1;
	private double precoAno2;
	private double precoAno3;
	
	public void definirModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public double getPrecoAno1() {
		return precoAno1;
	}

	public double getPrecoAno2() {
		return precoAno2;
	}

	public double getPrecoAno3() {
		return precoAno3;
	}

	public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
		this.precoAno1 = precoAno1;
		this.precoAno2 = precoAno2;
		this.precoAno3 = precoAno3;
	}
	
	public void exibirInfo() {
		System.out.println("--- Info da Classe Mãe ---");
		System.out.println("Modelo: " + modelo);
		System.out.println("Preço Ano 1: " + precoAno1);
		System.out.println("Preço Ano 2: " + precoAno2);
		System.out.println("Preço Ano 3: " + precoAno3);
		System.out.println("Menor Preço: " + calcularMenorPreco());
		System.out.println("Maior Preço: " + calculaMaiorPreco());
	}

	protected double calcularMenorPreco() {
		double menorPreco = precoAno1;
		
		if (precoAno2 < menorPreco) {
			menorPreco = precoAno3;
		}
		
		if (precoAno3 < menorPreco) {
			menorPreco = precoAno3;
		}
		
		return menorPreco;
	}
	
	protected double calculaMaiorPreco() {
		double maiorPreco = precoAno1;
		
		if (precoAno2 > maiorPreco) {
			maiorPreco = precoAno2;
		}
		
		if (precoAno3 > maiorPreco) {
			maiorPreco = precoAno3;
		}
		
		return maiorPreco;
	}
	
	
}
