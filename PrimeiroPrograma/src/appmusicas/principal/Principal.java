package appmusicas.principal;

import appmusicas.modelos.MinhasPreferidas;
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
		
		for (int i = 0; i < 700; i++) {
			musica.curte();
		}
		
		Podcast podcast = new Podcast();
		podcast.setTitulo("RapaduraCast");
		podcast.setHost("Jurandir");
		
		for (int i = 0; i < 900; i++) {
			podcast.reproduz();
		}
		
		for (int i = 0; i < 600; i++) {
			podcast.curte();
		}
		
		MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
		minhasPreferidas.inclui(musica);
		minhasPreferidas.inclui(podcast);
	}

}
