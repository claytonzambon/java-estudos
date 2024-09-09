package exercicios_OO.listasecolecoes.animal;

public class Cachorro extends Animal {

	private String pedigree;
	
	public Cachorro(String nome, double peso, String pedigree) {
		super(nome, peso);
		this.pedigree = pedigree;
	}

	public String getPedigree() {
		return pedigree;
	}

	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}
}
