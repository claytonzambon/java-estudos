package exercicios_OO.carro1;

import java.time.LocalDateTime;

public class Carro {

	String modelo;
	int ano;
	String cor;
	
	public String exibeFichaTecnica() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Modelo: " + modelo);
		sb.append("\nAno: " + ano);
		sb.append("\nCor: " + cor);
		sb.append("\nIdade do carro: " + retornaIdadeDoCarro());
		
		return sb.toString();
	}
	
	public int retornaIdadeDoCarro() {
		LocalDateTime data = LocalDateTime.now(); 
		return data.getYear() - ano;
	}
}