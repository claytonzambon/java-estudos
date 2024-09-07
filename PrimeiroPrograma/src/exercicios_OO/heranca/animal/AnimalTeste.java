package exercicios_OO.heranca.animal;

public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		
		Gato gato = new Gato();
		
		cachorro.emitirSom();
		cachorro.abanarRabo();
		
		gato.emitirSom();
		gato.aranharMoveis();

	}

}
