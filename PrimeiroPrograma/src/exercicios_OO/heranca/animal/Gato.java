package exercicios_OO.heranca.animal;

public class Gato extends Animal{

	@Override
	public void emitirSom() {
		System.out.println("Miau miau miau");
	}
	
	public void aranharMoveis() {
		System.out.println("Arranhando moveis");
	}
}