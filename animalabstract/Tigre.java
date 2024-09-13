package animalabstract;

public class Tigre extends Padrãoanimal {

	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O Tigre dorme");
		
	}

	@Override
	public void caminhar() {
		System.out.println("O TigreCaminha");
		
	}

	@Override
	public void correr() {
		System.out.println("O Tigre corre");
		
	}

}