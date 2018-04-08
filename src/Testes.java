
public class Testes {

	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		// Questão 32
		System.out.printf("%d\n",metodos.verifAlfabeto("ç"));
		// Questão 33
		System.out.printf("%d\n",metodos.verifCapicua("3013103333"));
		// Questão 34
		double a=30, b=5;
		System.out.printf("Número A: %f\n"
				+ "Número B: %f\n"
				+ "Menor número: %f", a, b, metodos.imprimeMenorValor(a, b));
	}

}
