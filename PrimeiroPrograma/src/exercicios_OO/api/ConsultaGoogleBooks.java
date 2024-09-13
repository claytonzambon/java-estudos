package exercicios_OO.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o título do livro: ");
        String tituloLivro = leitura.nextLine();

        String chave = "AIzaSyBhXRkMwJ-pYHTuy_SbmuN_P8avqMf9LfY";

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        
        leitura.close();
    }
}
