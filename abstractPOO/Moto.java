package abstractPOO;

public class Moto  extends Veiculos {
	public Moto(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}

	@Override
	public void acelarar() {
		System.out.println("A moto está acelerando");

	}

	@Override
	public void frear() {
		System.out.println("A moto está freiando");

	}

	@Override
	public void virar() {
		System.out.println("A moto está virando");

	}

	@Override
	public void ligar() {
		System.out.println("A moto está ligada ");

	}


}
