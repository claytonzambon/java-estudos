package exercicios_OO.escritaemarquivos.veiculo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VeiculoTeste {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Chevrolet", "Chevette", 1970, "Gasolina");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String json = gson.toJson(veiculo);
		System.out.println(json);

	}

}
