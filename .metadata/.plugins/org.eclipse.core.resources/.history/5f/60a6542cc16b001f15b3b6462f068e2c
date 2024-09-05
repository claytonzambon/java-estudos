package exercicios_OO;

public class Produto {

	private String nome;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double precoComDesconto(double desconto) {
		return preco * (1 - (desconto / 100));
	}
	
	public String toString() {
		return String.format("Nome: %s \nPreço: R$ %.2f\n", getNome(), getPreco());
	}
}
