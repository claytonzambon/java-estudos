package exercicios_OO.metodos.musica;

public class Musica {

	String titulo;
	String artista;
	int anoLancamento;
	double somaDasAvaliacoes;
	int numAvaliacoes;
	
	public String exibeFichaTecnica() {
		StringBuilder sb = new StringBuilder();
		sb.append("Título: " + titulo);
		sb.append("\nArtista: " + artista);
		sb.append("\nAno de Lançamento: " + anoLancamento);
		sb.append("\nAvaliação: " + mediaAvaliacoes());
		
		return sb.toString();
	}
	
	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		numAvaliacoes++;
	}
	
	double mediaAvaliacoes() {
		return somaDasAvaliacoes / numAvaliacoes;
	}
}
