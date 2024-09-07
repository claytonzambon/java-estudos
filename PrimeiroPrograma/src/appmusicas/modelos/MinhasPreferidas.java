package appmusicas.modelos;

public class MinhasPreferidas {

	public void inclui(Audio audio) {
		if (audio.getClassificacao() >= 9) {
			System.out.println(audio.getTitulo() + " é sucesso absoluto e preferido por todos");
		} else {
			System.out.println(audio.getTitulo() + " ótima opção para escutar");
		}
	}
}
