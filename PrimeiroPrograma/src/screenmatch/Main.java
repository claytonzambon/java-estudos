package screenmatch;

public class Main {

	public static void main(String[] args) {
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: Top Gun Maverick");

		int anoDeLancamento = 2022;
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		
		//Média calculada pelas três notas
		double media = (9.8 + 6.3 + 8.0) / 3;
		System.out.println(media);
		String sinopse;
		sinopse = """
				Filme Top Gun Maverick
				Filme de aventura com galã dos anos 80
				Muito bom!
				Ano de lançamento
				""" + anoDeLancamento;
		System.out.println(sinopse);
	}

}
