package exercicios_OO.livro;

public class Livro {

	private String titulo;
	private String autor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String exibirDetalhes() {
		return String.format("Título do Livro: %s \nAutor do Livro: %s", getTitulo(), getAutor());
	}
	
}
