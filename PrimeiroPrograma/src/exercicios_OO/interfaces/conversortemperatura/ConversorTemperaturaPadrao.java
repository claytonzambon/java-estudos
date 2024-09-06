package exercicios_OO.interfaces.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

	@Override
	public double celsiusParaFahrenheit(double celsius) {
		return (celsius * (9.0/5.0)) + 32;		
	}

	@Override
	public double fahrenheitParaCelsius(double fahrenheit) {
		return (5.0/9.0) * (fahrenheit - 32);
	}
	
}
