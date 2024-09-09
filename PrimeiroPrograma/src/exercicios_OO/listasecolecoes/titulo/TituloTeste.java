package exercicios_OO.listasecolecoes.titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TituloTeste {

	public static void main(String[] args) {

		Titulo titulo1 = new Titulo("Clube da Luta");
		Titulo titulo2 = new Titulo("Ace Ventura");
		Titulo titulo3 = new Titulo("Driver");
		Titulo titulo4 = new Titulo("Jurassic Park");
		
		List<Titulo> listaDeTitulos = new ArrayList<>();
		listaDeTitulos.add(titulo1);
		listaDeTitulos.add(titulo2);
		listaDeTitulos.add(titulo3);
		listaDeTitulos.add(titulo4);
		
		System.out.println("*** Lista de Títulos ***");
		System.out.println(listaDeTitulos);
		System.out.println("*** Lista de Títulos Ordenada ***");
		Collections.sort(listaDeTitulos);
		System.out.println(listaDeTitulos);

	}

}