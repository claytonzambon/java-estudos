package exercicios_OO.carro1;

public class CarroTeste {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.modelo = "Fiat Uno";
		carro.ano = 1999;
		carro.cor = "Branca";
		
		System.out.println(carro.exibeFichaTecnica());

	}

}
