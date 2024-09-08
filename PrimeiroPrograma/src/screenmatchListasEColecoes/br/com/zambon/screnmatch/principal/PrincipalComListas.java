package screenmatchListasEColecoes.br.com.zambon.screnmatch.principal;

import java.util.ArrayList;

import screenmatchListasEColecoes.br.com.zambon.screnmatch.modelos.Filme;
import screenmatchListasEColecoes.br.com.zambon.screnmatch.modelos.Serie;
import screenmatchListasEColecoes.br.com.zambon.screnmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("O Poderoso chefão", 1970);
		meuFilme.avalia(9);
		
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(6);
		
		var filmeZambon = new Filme("Interestelar", 2014);
		filmeZambon.avalia(10);
		
		Serie lost = new Serie("Lost", 2002);
		
		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(filmeZambon);
		lista.add(lost);

		for (Titulo item : lista) {
			System.out.println(item.getNome());
			Filme filme = (Filme) item;
			System.out.println("Classificação: " + filme.getClassificacao());
		}
	}

}
