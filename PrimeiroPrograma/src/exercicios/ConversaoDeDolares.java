package exercicios;

public class ConversaoDeDolares {

	public static void main(String[] args) {
		
		double valorEmDolares = 150.50;
		double valorDoDolarEmReais = 4.94;
		double valorTotal = valorEmDolares * valorDoDolarEmReais;
		
		System.out.printf("O valor de $ %.2f dólares em Reais é de R$ %.2f", valorEmDolares, valorTotal);

	}

}