package exercicios_OO.escritaemarquivos.titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TituloTeste {

	public static void main(String[] args) {
		Titulo titulo = new Titulo("Mercúrio", "1900", "Lages-SC");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(titulo);
		
		System.out.println(json);

	}

}
