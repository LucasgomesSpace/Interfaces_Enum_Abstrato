package salario;

public class Jornada implements Salario {

	// horas de trabalho = 8 horas
	// valor da hora de trabalho = 30 
	
	int a = 30;
	int b = 8;
	int bruto ;
	
	@Override
	public long id() {
		
		System.out.println(100000l);
		
		return 0;
	}

	@Override
	public void nome() {
		System.out.println("Oziel");
		
	}

	@Override
	public void telefone() {
		System.out.println("(15) 999578596");
		
	}

	@Override
	public int matricula() {
		System.out.println(5496);
		return 0;
	}

	@Override
	public void endereco() {
		System.out.println("Rua Padre Brunete, numero: 77");
		
	}

	@Override
	public double sal() {
			
		int bruto = b * a;
		System.out.println("seu salario bruto é " + bruto);
		return 0;
	}

	
	
}
