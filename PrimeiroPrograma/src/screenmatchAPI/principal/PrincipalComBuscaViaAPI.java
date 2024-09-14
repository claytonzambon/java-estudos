package screenmatchAPI.principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import screenmatchAPI.excecao.ErroDeConversaoException;
import screenmatchAPI.modelos.Titulo;
import screenmatchAPI.modelos.TituloOmdb;
import screenmatchAPI.services.RequisicoesHttp;

public class PrincipalComBuscaViaAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner leitura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        RequisicoesHttp request = new RequisicoesHttp();
        
        String busca = "";
        
        while(!busca.equalsIgnoreCase("sair")) {
        
	        System.out.print("Informe o nome do filme ou (sair): ");
	        busca = leitura.nextLine();
	        
	        if (busca.equalsIgnoreCase("sair")) {
	        	break;
	        }
	
	        try {
	        	String endereco = request.montaUrl(busca);
	        	String json = request.consumirAPI(endereco);
	        	
		        System.out.println(json);
		        
		        TituloOmdb meuTituloOmdb = request.gson.fromJson(json, TituloOmdb.class);
		        System.out.println(meuTituloOmdb);
	        
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
        
        request.gravarArquivos("Filmes.json", titulos);
        
        System.out.println("\n\n--- Sistema finalizado ---");
        
        leitura.close();
    }
}