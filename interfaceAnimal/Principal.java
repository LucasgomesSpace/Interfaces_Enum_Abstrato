package interfaceAnimal;

public class Principal {

	public static void main(String[] args) {

		Lobo lobo = new Lobo();
		Cachorro cach = new Cachorro();
		
		System.out.println("Ações do lobo");
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		System.out.println("\n"+"Ações do cachorro");
		cach.caminhar();
		cach.correr();
		cach.dormir();
		cach.emitirSom();
		

	}

}
