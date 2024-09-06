package exercicios_OO.interfaces.conversormoeda;

public class ConversorMoeda implements ConversaoFinanceira{

	@Override
	public void converterDolarParaReal(double valorDolar) {
		double cotacaoDolar = 5.50;
		double valorReal = valorDolar * cotacaoDolar;
		System.out.println("O valor em reais é: R$ " + valorReal);
	}
	
}
