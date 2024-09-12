package animalTeste;

public class Cachorro extends Animal {

	private String pedigree;
	
	public Cachorro(double peso, String especie) {
		super(peso, especie);
		// TODO Auto-generated constructor stub
	}
	
	public String getPedigree() {
		return pedigree;
	}
	
	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}

	public String locomover() {
		return "Correndo..";
	}
}
