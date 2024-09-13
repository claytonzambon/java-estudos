package exercicios_OO.api.pessoa;

import com.google.gson.Gson;

public class Pessoa_ConversaoJsonParaObjeto {

	public static void main(String[] args) {
		
		String jsonPessoa = "{\"nome\":\"Mercurio\",\"idade\":41,\"cidade\":\"Lages\"}";
		
		Gson gson = new Gson();
		Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
		
		System.out.println("Objeto Pessoa: " + pessoa);

	}

}
