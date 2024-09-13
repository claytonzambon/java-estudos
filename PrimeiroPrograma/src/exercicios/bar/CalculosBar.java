package exercicios.bar;

public class CalculosBar {

	private char sexo;
	private int cerveja;
	private int refrigerante;
	private int espetos;
	private double ingresso;
	private double consumo;
	
	public CalculosBar(char sexo, int cerveja, int refrigerante, int espetos) {
		this.sexo = sexo;
		this.cerveja = cerveja;
		this.refrigerante = refrigerante;
		this.espetos = espetos;
		
		//Calculos
		if (sexo == 'F') {
			this.ingresso = 8.0;
		} else {
			this.ingresso = 10.0;
		}
	}

	public char getSexo() {
		return sexo;
	}

	public int getCerveja() {
		return cerveja;
	}

	public int getRefrigerante() {
		return refrigerante;
	}

	public int getEspetos() {
		return espetos;
	}

	public double getIngresso() {
		return ingresso;
	}
	
	public double getConsumo() {
		this.consumo = cerveja * 5.0 + refrigerante * 3.0 + espetos * 7.0;
		return consumo;
	}

	public double getCouvert() {	
		double couvert = 4.0;
		
		if (consumo > 30) {
			return couvert = 0.0;
		} else {
			return couvert;
		}
	}
	
	public double getTotalIngresso() {
		double totalIngresso = ingresso + consumo + getCouvert();
		return totalIngresso;
	}
}