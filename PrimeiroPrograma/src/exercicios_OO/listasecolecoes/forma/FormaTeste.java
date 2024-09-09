package exercicios_OO.listasecolecoes.forma;

import java.util.ArrayList;

public class FormaTeste {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(3.5);
		
		Quadrado quadrado1 = new Quadrado(10);
		
		Circulo circulo2 = new Circulo(12.6);
		
		Quadrado quadrado2 = new Quadrado(11);
		
		ArrayList<Forma> listaFormas = new ArrayList<>();
		listaFormas.add(circulo1);
		listaFormas.add(circulo2);
		listaFormas.add(quadrado1);
		listaFormas.add(quadrado2);
		
		for (Forma forma : listaFormas) {
			System.out.println("Área do " + forma.toString() + ": " + forma.calcularArea());
		}

	}

}
