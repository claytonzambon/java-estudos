package exercicios_OO.numerosPrimos;

public class NumerosPrimosTeste {

	public static void main(String[] args) {
		
		int numero = 17;
		VerificadorPrimo verificador = new VerificadorPrimo();
		verificador.verificarSeEhPrimo(numero);
		
		GeradorPrimo gerador = new GeradorPrimo();
		int proximoPrimo = gerador.gerarProximoPrimo(numero);
		System.out.println("O próximo primo após " + numero + " é: " + proximoPrimo);
		
		NumerosPrimos numerosPrimos = new NumerosPrimos();
		numerosPrimos.listarPrimos(30);
	}
}
