
public class Testes {

	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		// Quest�o 32
		System.out.printf("%d\n",metodos.verifAlfabeto("�"));
		// Quest�o 33
		System.out.printf("%d\n",metodos.verifCapicua("3013103333"));
		// Quest�o 34
		double a=30, b=5;
		System.out.printf("N�mero A: %f\n"
				+ "N�mero B: %f\n"
				+ "Menor n�mero: %f", a, b, metodos.imprimeMenorValor(a, b));
	}

}
