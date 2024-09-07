package screenmatchOO.br.com.zambon.screnmatch.modelos;

public class Titulo {
	//Todo titulo tem:
	//Todo atributo precisa ser privado
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

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
