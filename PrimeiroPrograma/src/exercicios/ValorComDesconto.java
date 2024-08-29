package exercicios;

public class ValorComDesconto {

	public static void main(String[] args) {
		
		double precoOriginal = 320.00;
		double percentualDesconto = 10;
		double valorComDesconto = precoOriginal * (1 - percentualDesconto / 100);
		
		System.out.printf("O valor original de R$ %.2f com %.2f de desconto é: R$ %.2f", precoOriginal, percentualDesconto, valorComDesconto);

	}

}
