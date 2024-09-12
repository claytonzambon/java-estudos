package animalTeste;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		Animal a1 = new Cachorro(9, "Canino");
		
		JOptionPane.showMessageDialog(null, a1.locomover());
		//System.out.println(a1.locomover());

	}

}
