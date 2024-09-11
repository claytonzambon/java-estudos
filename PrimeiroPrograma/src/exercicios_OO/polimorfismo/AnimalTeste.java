package exercicios_OO.polimorfismo;

import javax.swing.JOptionPane;

public class AnimalTeste {

	public static void main(String[] args) {
		
		GralhaAzul ave = new GralhaAzul();
		
		JOptionPane.showMessageDialog(null, ave.locomover());
		
		Animal animal = new Animal();
		
		JOptionPane.showMessageDialog(null, animal.locomover());
		
	}

}
