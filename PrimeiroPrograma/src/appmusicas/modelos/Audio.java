package appmusicas.modelos;

public class Audio {
	private String titulo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	public void curte() {
		this.totalCurtidas++; 
	}
	public void reproduz() {
		this.totalReproducoes++;
	}

}
