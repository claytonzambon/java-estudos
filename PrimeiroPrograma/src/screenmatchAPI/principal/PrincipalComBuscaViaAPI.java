package screenmatchAPI.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import screenmatchAPI.modelos.Titulo;
import screenmatchAPI.modelos.TituloOmdb;

public class PrincipalComBuscaViaAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner leitura = new Scanner(System.in);
        System.out.print("Informe o nome do filme: ");
        String busca = leitura.nextLine();

        String chaveAPI = "cf99fd64";
        
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + chaveAPI;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
        
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        
        System.out.println("Título já convertido:");
        System.out.println(meuTitulo);

        leitura.close();
    }
}