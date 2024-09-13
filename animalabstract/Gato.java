package animalabstract;

public class Gato extends Padrãoanimal{

	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O Gato dorme");

	}

	@Override
	public void caminhar() {
		System.out.println("O Gato Caminha");

	}

	@Override
	public void correr() {
		System.out.println("O Gato corre");

	}

}