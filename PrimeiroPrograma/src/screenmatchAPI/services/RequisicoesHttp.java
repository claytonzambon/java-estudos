package screenmatchAPI.services;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import screenmatchAPI.modelos.Titulo;

public class RequisicoesHttp {

	private String chaveAPI = "cf99fd64";
	
	public Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
			.setPrettyPrinting()
			.create();
	
	public String consumirAPI(String endereco) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());
        
        return response.body();
	}
	
	public void gravarArquivos(String nomeArquivo, List<Titulo> titulos) throws IOException {
        FileWriter escrita = new FileWriter(nomeArquivo);
        escrita.write(gson.toJson(titulos));
        escrita.close();
	}
	
	public String montaUrl(String busca) {
		return "https://www.omdbapi.com/?t=" 
				+ busca.replace(" ", "+") 
				+ "&apikey=" + chaveAPI;
	}
	
}
