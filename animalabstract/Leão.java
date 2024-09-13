package animalabstract;

public class Leão extends Padrãoanimal {

	public Leão(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O Leão dorme");
		
	}

	@Override
	public void caminhar() {
		System.out.println("O Leão Caminha");
		
	}

	@Override
	public void correr() {
		System.out.println("O Leão corre");
		
	}

}