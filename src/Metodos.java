
public class Metodos {
	// Questão 01
	public String imprimeAntSuc(int n) {
		return String.format("\n\nNúmero escolhido: %d\n" + "Número antecessor: %d\n" + "Número sucessor: %d\n", n, n--,
				n++);
	}

	// Questão 02
	public double calculaMedia(double a, double b, double c) {
		return ((a + b + c) / 3);
	}

	// Questão 03
	public double conversorTemperaturaCF(double temp) {
		temp = ((temp / 5) * 9) + 32;
		return temp;
	}

	// Questão 04
	public String imprimeDolares(double x) {
		return String.format(
				"\n\nValor original: U$ %f.2" + "\nA primeira pessoa recebe: U$ %f.2"
						+ "\nA segunda pessoa recebe: U$ %f.2" + "\nA terceira pessoa recebe: U$ %f.2",
				x, x * 0.3, x * 0.38, x * 0.32);
	}

	// Questão 05
	public String imprimeReqLatao(double x) {
		return String.format(
				"\n\nQuantidade de Latão: %f.3 Kg" + "\nMaterial necessário:" + "\nCobre: %f.3 Kg" + "\nZinco: %f.3 Kg",
				x, (x * 0.1) * 7, (x * 0.10 * 3));
	}

	// Questão 06
	public String verifMaior20(double x) {
		if (x > 20)
			return String.format("\n\n%d é maior que 20.", x);
		else
			return String.format("\n\n%d é menor ou igual a 20.", x);
	}

	// Questão 07
	public boolean verifMenorIgual10(int x) {
		return x <= 10;
	}

	public int somaInteiros(int x, int y) {
		return x + y;
	}

	public String imprimeMenorIgual10(int x, int y) {
		if (this.verifMenorIgual10(this.somaInteiros(x, y)))
			return String.format("\nA soma entre %d e %d é menor ou igual a 10.", x, y);
		else
			return String.format("\nA soma entre %d e %d é igual a %d.", x, y, this.somaInteiros(x, y));
	}

	// Questão 08
	public String imprimeParImpar(int x) {
		if (x % 2 == 0)
			return String.format("\n%d é par.", x);
		else
			return String.format("\n%d é impar.", x);
	}

	// Questão 09
	public String imprimePosNegNul(int i) {
		if (i > 0)
			return String.format("\n%d é positivo.", i);
		else if (i < 0)
			return String.format("\n%d é negativo.", i);
		else
			return String.format("\n%d é nulo.", i);
	}
	
	//
}
