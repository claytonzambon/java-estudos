package exercicios_OO.escritaemarquivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscrevaEmArquivo {

	public static void main(String[] args) throws IOException {

		FileWriter escrita = new FileWriter("Escreva.txt");
		
		escrita.write("Utilize as classes do pacote java.io");
		escrita.close();

	}

}
