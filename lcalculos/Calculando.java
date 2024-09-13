package lcalculos;

public class Calculando implements Calculo {

	double a = 0;
	int b = 0;


	@Override
	public double somar() {
		a = 5 + 5;
		System.out.println("soma = " + a);

		return 0;
	}

	@Override
	public double subtrair() {		

		a = 0;
		a = 10 - 5;

		System.out.println("Subtração = " + a);
		return 0;
	}

	@Override
	public double multplicao() {
		a = 0;
		a = 10 * 5.2;
		System.out.println("Multiplicação = " + a);
		return 0;
	}

	@Override
	public int divisão() {

		b = 70/5 ;
		System.out.println("Divisão = " + b);
		return 0;
	}

	@Override
	public int exp() {

		System.out.println("Exponencial = " + Math.pow(5, 2));
		return 0;
	}

}
