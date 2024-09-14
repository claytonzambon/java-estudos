package exercicios_OO.escritaemarquivos.titulo;

public class Titulo {
	private String nome;
	private String ano;
	private String cidade;
	
	public Titulo(String nome, String ano, String cidade) {
		this.nome = nome;
		this.ano = ano;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public String getAno() {
		return ano;
	}

	public String getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return "(Nome : " + nome + ", ano: " + ano + ", cidade: " + cidade + ")";
	}
	
	
}
