package exercicios_OO.listasecolecoes.animal;

public class AnimalTeste {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Benji", 10.42, "Vira-lata");
		Animal animal = (Animal) cachorro;
	}

}
