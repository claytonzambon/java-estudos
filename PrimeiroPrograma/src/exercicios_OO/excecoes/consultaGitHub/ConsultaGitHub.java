package exercicios_OO.excecoes.consultaGitHub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class ConsultaGitHub {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String userName, endereco;
		System.out.println("Digite o nome do usuário do GitHub para consultar informações: ");
		userName = leitura.nextLine();
		
		endereco = "https://api.github.com/users/" + userName.replace(" ", "+");
		
		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(endereco))
					.header("Accept", "application/vnd.github.v3+json")
					.build();
			
			HttpResponse<String> response = client
					.send(request, HttpResponse.BodyHandlers.ofString());
			
			if (response.statusCode() == 404) {
				throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub");
			}
			
			String json = response.body();
			System.out.println(json);
			//JOptionPane.showMessageDialog(null, json);
			
			Gson gson = new Gson();
			UserGitHub meuUser = gson.fromJson(json, UserGitHub.class);
			System.out.println(meuUser);
			
		} catch (IOException | InterruptedException e) {
			System.out.println("Ops... Houve um erro durante a consulta à API do GitHub");
		} catch (ErroConsultaGitHubException e) {
			System.out.println(e.getMessage());
		}
		
		
		leitura.close();
	}

}
