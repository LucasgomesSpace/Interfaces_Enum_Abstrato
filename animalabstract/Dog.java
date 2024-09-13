package animalabstract;

public class Dog extends Padrãoanimal {
	public Dog(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O Cachorro dorme");

	}

	@Override
	public void caminhar() {
		System.out.println("O Cachorro Caminha");

	}

	@Override
	public void correr() {
		System.out.println("O Cachorro corre");

	}

}