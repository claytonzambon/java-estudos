package animalTeste;

public class Animal {
	
	private double peso;
	private String especie;
	
	public Animal(double peso, String especie) {
		this.peso = peso;
		this.especie = especie;
	}

	public String locomover() {
		return "Não sei...";
	}
}
