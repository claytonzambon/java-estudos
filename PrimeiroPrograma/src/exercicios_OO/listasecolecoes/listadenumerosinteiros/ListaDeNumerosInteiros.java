package exercicios_OO.listasecolecoes.listadenumerosinteiros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeNumerosInteiros {

	public static void main(String[] args) {
		
		List<Integer> listaDeNumerosInteiros = new ArrayList<>();
		
		listaDeNumerosInteiros.add(113);
		listaDeNumerosInteiros.add(41);
		listaDeNumerosInteiros.add(30);
		listaDeNumerosInteiros.add(7);
		listaDeNumerosInteiros.add(2);
		
		System.out.println("*** Lista de Números Inteiros ***");
		System.out.println(listaDeNumerosInteiros);
		
		System.out.println("*** Lista de Números Inteiros Ordenada ***");
		Collections.sort(listaDeNumerosInteiros);
		System.out.println(listaDeNumerosInteiros);
	}

}
