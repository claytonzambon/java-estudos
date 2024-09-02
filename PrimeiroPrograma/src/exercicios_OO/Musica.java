package exercicios_OO;

public class Musica {

	String titulo;
	String artista;
	int anoLancamento;
	double somaDasAvaliacoes;
	int numAvaliacoes;
	
	public String exibeFichaTecnica() {
		StringBuilder sb = new StringBuilder();
		sb.append("Título: " + titulo);
		sb.append("Artista: " + artista);
		sb.append("Ano de Lançamento: " + anoLancamento);
		sb.append("Avaliação: " + somaDasAvaliacoes);
		
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
