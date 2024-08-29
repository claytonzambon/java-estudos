package exercicios;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		double temperaturaEmCelsius = 30.4;
		double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
		
		String mensagem = String.format("A temperatura de %.2f em Celsius é equivalente a %.2f em Fahrenheit.", temperaturaEmCelsius, temperaturaEmFahrenheit);
		
		System.out.println(mensagem);
		
		int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
		System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
	}

}
