package appmusicas.principal;

import appmusicas.modelos.Musica;
import appmusicas.modelos.Podcast;

public class Principal {

	public static void main(String[] args) {
		Musica musica = new Musica();
		musica.setTitulo("Forever");
		musica.setArtista("Kiss");
		
		for (int i = 0; i < 1000; i++) {
			musica.reproduz();
		}
		
		for (int i = 0; i < 50; i++) {
			musica.curte();
		}
		
		Podcast podcast = new Podcast();
		podcast.setTitulo("RapaduraCast");
		podcast.setHost("Jurandir");
		
		for (int i = 0; i < 900; i++) {
			podcast.reproduz();
		}
		
		for (int i = 0; i < 100; i++) {
			podcast.curte();
		}
	}

}