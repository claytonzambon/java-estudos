package exercicios_OO.encapsulamento.idadepessoa;

public class IdadePessoa {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String verificaSeMaiorDeIdade() {
		if (getIdade() > 17) {
			return String.format("O %s é MAIOR de idade e tem %d", getNome(), getIdade());
		} else {
			return String.format("O %s é MENOR de idade e tem %d", getNome(), getIdade());
		}
	}
}
