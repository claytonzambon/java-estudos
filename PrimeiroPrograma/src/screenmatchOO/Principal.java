package screenmatchOO;

import screenmatchOO.br.com.zambon.screnmatch.calculos.CalculadoraDeTempo;
import screenmatchOO.br.com.zambon.screnmatch.calculos.FiltroRecomendacao;
import screenmatchOO.br.com.zambon.screnmatch.modelos.Episodio;
import screenmatchOO.br.com.zambon.screnmatch.modelos.Filme;
import screenmatchOO.br.com.zambon.screnmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("O Poderoso chefão");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		
		System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());
		
		//Atribuindo valor direto no atributo
		//Isso não pode acontecer
		//meuFilme.somaDasAvaliacoes = 10;
		//meuFilme.totalDeAvaliacoes = 1;
		
		//System.out.println(meuFilme.pegaMedia());
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2002);
		lost.exibeFichaTecnica();
		lost.setAnoDeLancamento(5);
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosporEpisodio(50);
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Avatar");
		outroFilme.setAnoDeLancamento(2023);
		outroFilme.setDuracaoEmMinutos(200);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
	}

}
