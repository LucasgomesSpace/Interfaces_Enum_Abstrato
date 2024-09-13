package abstractPOO;

public class Principal {
	public static void main(String[] args) {

		Carro ferrari = new Carro("00000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelarar();
		ferrari.virar();
		ferrari.frear();

		System.out.println("----------------------------");

		Onibus marcopolo = new Onibus("11111", "XB1", "Prata, 2020", 2020);
		marcopolo.ligar();
		marcopolo.acelarar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("----------------------------");
		
		Carro fusca = new Carro("00000", "F1", "Vermelho", 2023);
		fusca.ligar();
		fusca.acelarar();
		fusca.virar();
		fusca.frear();
		
		System.out.println("----------------------------");
		
		Moto cbmil = new Moto("00000", "F1", "Branco", 2023);
		cbmil.ligar();
		cbmil.acelarar();
		cbmil.virar();
		cbmil.frear();
	}
}