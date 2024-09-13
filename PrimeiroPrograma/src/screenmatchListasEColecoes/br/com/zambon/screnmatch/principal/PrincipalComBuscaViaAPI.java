package screenmatchListasEColecoes.br.com.zambon.screnmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class PrincipalComBuscaViaAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner leitura = new Scanner(System.in);

        HttpClient client = HttpClient.newHttpClient();

        System.out.print("Informe o nome do filme: ");
        String busca = leitura.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=cf99fd64";

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        System.out.println(response.body());
        //JOptionPane.showMessageDialog(null, response.body(), null, 0);

        leitura.close();
    }
}