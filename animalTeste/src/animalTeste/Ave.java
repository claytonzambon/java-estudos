package animalTeste;

public class Ave extends Animal {

	private boolean podeVoar; 
	
	public Ave(double peso, String especie) {
		super(peso, especie);
	}
	
	public boolean isPodeVoar() {
		return podeVoar;
	}

	public void setPodeVoar(boolean podeVoar) {
		this.podeVoar = podeVoar;
	}

	public String locomover() {
		return "Voando...";
	}
	
}
