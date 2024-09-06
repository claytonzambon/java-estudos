package exercicios_OO.interfaces.calculavel;

public class Livro extends Produto implements Calculavel{

	private String autor;
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public double calcularPrecoFinal() {
		return preco * 0.9;
	}

}
