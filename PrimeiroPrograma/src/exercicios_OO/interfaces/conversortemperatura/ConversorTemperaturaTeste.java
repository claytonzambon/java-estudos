package exercicios_OO.interfaces.conversortemperatura;

public class ConversorTemperaturaTeste {

	public static void main(String[] args) {
		ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
		
		double temperaturaCelsius = 37;
		System.out.println(temperaturaCelsius + " Celsius é igual a " + conversor.celsiusParaFahrenheit(temperaturaCelsius));
		
		double temperaturaFahrenheit = 98;
		System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + conversor.fahrenheitParaCelsius(temperaturaFahrenheit));
	}

}
