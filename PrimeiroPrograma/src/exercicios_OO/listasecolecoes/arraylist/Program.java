package exercicios_OO.listasecolecoes.arraylist;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> listas = new ArrayList<>();
		
		listas.add("Seu Madruga");
		listas.add("Seu Barriga");
		listas.add("Dona Florinda");
		listas.add("Professor Girafales");
		listas.add("Kiko");
		
		// Primeira forma
		for (String item : listas) {
			System.out.println(item);
		}
		
		//Segunda forma
		//listas.forEach(lista -> System.out.println(lista));
		
		// Terceira forma
		//listas.forEach(System.out::println);

	}

}
