
public class Metodos {
	// Quest�o 01
	public String imprimeAntSuc(int n) {
		return String.format("\n\nN�mero escolhido: %d\n" + "N�mero antecessor: %d\n" + "N�mero sucessor: %d\n", n, n--,
				n++);
	}

	// Quest�o 02
	public double calculaMedia(double a, double b, double c) {
		return ((a + b + c) / 3);
	}

	// Quest�o 03
	public double conversorTemperaturaCF(double temp) {
		temp = ((temp / 5) * 9) + 32;
		return temp;
	}

	// Quest�o 04
	public String imprimeDolares(double x) {
		return String.format(
				"\n\nValor original: U$ %f.2" + "\nA primeira pessoa recebe: U$ %f.2"
						+ "\nA segunda pessoa recebe: U$ %f.2" + "\nA terceira pessoa recebe: U$ %f.2",
				x, x * 0.3, x * 0.38, x * 0.32);
	}

	// Quest�o 05
	public String imprimeReqLatao(double x) {
		return String.format(
				"\n\nQuantidade de Lat�o: %f.3 Kg" + "\nMaterial necess�rio:" + "\nCobre: %f.3 Kg" + "\nZinco: %f.3 Kg",
				x, (x * 0.1) * 7, (x * 0.10 * 3));
	}

	// Quest�o 06
	public String verifMaior20(double x) {
		if (x > 20)
			return String.format("\n\n%d � maior que 20.", x);
		else
			return String.format("\n\n%d � menor ou igual a 20.", x);
	}

	// Quest�o 07
	public boolean verifMenorIgual10(int x) {
		return x <= 10;
	}

	public int somaInteiros(int x, int y) {
		return x + y;
	}

	public String imprimeMenorIgual10(int x, int y) {
		if (this.verifMenorIgual10(this.somaInteiros(x, y)))
			return String.format("\nA soma entre %d e %d � menor ou igual a 10.", x, y);
		else
			return String.format("\nA soma entre %d e %d � igual a %d.", x, y, this.somaInteiros(x, y));
	}

	// Quest�o 08
	public String imprimeParImpar(int x) {
		if (x % 2 == 0)
			return String.format("\n%d � par.", x);
		else
			return String.format("\n%d � impar.", x);
	}

	// Quest�o 09
	public String imprimePosNegNul(int i) {
		if (i > 0)
			return String.format("\n%d � positivo.", i);
		else if (i < 0)
			return String.format("\n%d � negativo.", i);
		else
			return String.format("\n%d � nulo.", i);
	}
	
	//
}
