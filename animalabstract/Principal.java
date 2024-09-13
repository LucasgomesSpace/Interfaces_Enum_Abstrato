package animalabstract;

public class Principal {

	public static void main(String[] args) {

		
			Lobo lobo = new Lobo("lobo","Masculino","Artico");

			lobo.caminhar();
			lobo.correr();
			lobo.dormir();
			System.out.println(Sons.Uiva);

			System.out.println("----------------------------");
			Leão leao = new Leão("Lion", "Masculino", "Africano");
			
			leao.caminhar();
			leao.correr();
			leao.dormir();
			System.out.println(Sons.Ruge);
			System.out.println("----------------------------");
			
			Tigre tig = new Tigre("Sabre", " Masculino", "Branco");
			
			tig.caminhar();
			tig.correr();
			tig.dormir();
			System.out.println(Sons.Ruge);
			System.out.println("----------------------------");
			
			Dog dog = new Dog ("Caramelo", "Masculino", "Não reconhecido");
			dog.caminhar();
			dog.correr();
			dog.dormir();
			System.out.println(Sons.Late);
			System.out.println("----------------------------");
			
			Gato cat = new Gato("Feia", "Femea", "Ciames");
			cat.caminhar();
			cat.correr();
			cat.dormir();
			System.out.println(Sons.Mia);
			
		}

	}

