package screenmatchOO.br.com.zambon.screnmatch.modelos;

public class Filme {
	//Todo filme tem:
	public String nome;
	public int anoDeLancamento;
	boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	public int duracaoEmMinutos;
	
	//Método acessor
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
	}
	
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
}
