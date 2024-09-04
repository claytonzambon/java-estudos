package screenmatchOO.br.com.zambon.screnmatch.modelos;

public class Serie extends Titulo {
	private int temporadas;
	private boolean ativa;
	private int episodiosPorTemporada;
	private int minutosporEpisodio;
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public boolean getAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public int getMinutosporEpisodio() {
		return minutosporEpisodio;
	}
	public void setMinutosporEpisodio(int minutosporEpisodio) {
		this.minutosporEpisodio = minutosporEpisodio;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorTemporada * minutosporEpisodio;
	}
}
