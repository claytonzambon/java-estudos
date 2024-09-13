package exercicios_OO.api.pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Pessoa_ConversaoJsonParaObjeto {

	public static void main(String[] args) {
		
		String jsonPessoa = "{\"nome\":\"Mercurio\",\"idade\":41,\"cidade\":\"Lages\"}";
		
		//Gson gson = new Gson();
		Gson gson = new GsonBuilder().setLenient().create();
		Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
		
		System.out.println("Objeto Pessoa: " + pessoa);

	}

}
