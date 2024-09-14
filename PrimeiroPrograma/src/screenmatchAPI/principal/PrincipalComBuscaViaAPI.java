package screenmatchAPI.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import screenmatchAPI.excecao.ErroDeConversaoException;
import screenmatchAPI.modelos.Titulo;
import screenmatchAPI.modelos.TituloOmdb;

public class PrincipalComBuscaViaAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner leitura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        
        String busca = "";
        
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        
        while(!busca.equalsIgnoreCase("sair")) {
        
	        System.out.print("Informe o nome do filme ou (sair): ");
	        busca = leitura.nextLine();
	        
	        if (busca.equalsIgnoreCase("sair")) {
	        	break;
	        }
	
	        String chaveAPI = "cf99fd64";
	        
	        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + chaveAPI;
	
	        try {
		        HttpClient client = HttpClient.newHttpClient();
		
		        HttpRequest request = HttpRequest.newBuilder()
		            .uri(URI.create(endereco))
		            .build();
		
		        HttpResponse<String> response = client
		            .send(request, BodyHandlers.ofString());
		
		        String json = response.body();
		        System.out.println(json);
		        
		        //Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
		        System.out.println(meuTituloOmdb);
	        
		        //try {
	        	Titulo meuTitulo = new Titulo(meuTituloOmdb);
	        	System.out.println("Título já convertido:");
	            System.out.println(meuTitulo);
	            
	            titulos.add(meuTitulo);
	            
	        } catch (NumberFormatException e) {
	        	System.out.println("Ocorreu um erro: " + e.getMessage());
	        } catch (IllegalArgumentException e) {
	        	System.out.println("Ocorreu um erro: " + e.getMessage());
	        } catch (ErroDeConversaoException e) {
	        	System.out.println(e.getMessage());
	        }
        }
        
        System.out.println(titulos);
        
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        
        System.out.println("\n\n--- Sistema finalizado ---");
        
        leitura.close();
    }
}