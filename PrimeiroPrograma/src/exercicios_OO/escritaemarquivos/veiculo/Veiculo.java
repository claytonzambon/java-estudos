package exercicios_OO.escritaemarquivos.veiculo;

public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private String combustivel;
	
	public Veiculo(String marca, String modelo, int ano, String combustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.combustivel = combustivel;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getCombustivel() {
		return combustivel;
	}
}
