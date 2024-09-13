package animalabstract;

public class Lobo extends Padrãoanimal{

	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O Lobo dorme");
		
	}

	@Override
	public void caminhar() {
		System.out.println("O Lobo Caminha");
		
	}

	@Override
	public void correr() {
		System.out.println("O Lobo corre");
		
	}

}