package exercicios_OO.interfaces.tabuadamultiplicacao;

public class TabuadaMultiplicacao implements Tabuada{

	@Override
	public void mostrarTabuada(int numero) {
		System.out.println("Tabuada do número: " + numero);
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
	}

}
