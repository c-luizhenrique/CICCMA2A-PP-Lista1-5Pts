import java.util.Scanner;
import java.util.regex.Pattern;

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

	// Quest�o 10
	public double imprimeResPosNeg(int x) {
		double y = 0;
		if (x < 0)
			y = Math.pow(x, 2);
		else
			y = Math.sqrt(x);
		return y;
	}

	// Quest�o 11
	public String imprimeMenorValor(double a, double b, double c, double d) {
		double temp = 0;
		double[] lista = { a, b, c, d };
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
			}
		}
		return String.format("O menor valor � %d\n" + "O maior valor � %d", lista[0], lista[lista.length - 1]);
	}

	// Quest�o 12
	public void imprimeCrescente(double a, double b, double c) {
		double temp = 0;
		double[] lista = { a, b, c };
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
			}
		}
		for (double i : lista) {
			System.out.println(i + " ");
		}
	}

	// Quest�o 13
	public void imprimeDecrescente(double a, double b, double c) {
		double temp = 0;
		double[] lista = { a, b, c };
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] < lista[j + 1]) {
					temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
			}
		}
		for (double i : lista) {
			System.out.println(i + " ");
		}
	}

	// Quest�o 14
	public String verifCriterioNum(int x) {
		if (x == 5)
			return "� igual a 5";
		else if (x == 200)
			return "� igual a 200";
		else if (x == 400)
			return "� igual a 400";
		else if (x > 499 && x < 1001)
			return "Est� entre 500 e 1000";
		else
			return "N�o � 5, 200, 400, nem est� entre 500 e 1000";
	}

	// Quest�o 15
	public String imprimeValoresReais(double x, double y) {
		if (x < y)
			if (Math.sqrt(y) == Double.NaN)
				return String.format("Menor n�mero ao quadrado: %d\n", x);
			else
				return String.format("Menor n�mero ao quadrado: %d\n" + "Raiz do maior n�mero: %d", x, y);
		else if (Math.sqrt(x) == Double.NaN)
			return String.format("Menor n�mero ao quadrado: %d\n", y);
		else
			return String.format("Menor n�mero ao quadrado: %d\n" + "Raiz do maior n�mero: %d", y, x);
	}

	// Quest�o 16
	public void imprime050() {
		for (int i = 0; i < 51; i++)
			System.out.println(i + " ");
	}

	// Quest�o 17
	public void imprime100200() {
		for (int i = 100; i < 201; i++)
			System.out.println(i + " ");
	}

	// Quest�o 18
	public void imprimeQuadrado(int lista[]) {
		for (int x : lista)
			System.out.println(Math.pow(x, 2) + " ");
	}

	// Quest�o 19
	public void imprime1100() {
		int soma = 0;
		for (int i = 1; i < 51; i++) {
			System.out.println(i + " ");
			soma = +i;
		}
		System.out.println(soma);
	}

	// Quest�o 20
	public void imprime1100cQuadrado() {
		double soma = 0;
		for (int i = 1; i < 51; i++) {
			System.out.println(i + " ");
			soma = +Math.pow(i, 2);
		}
		System.out.println(soma);
	}

	// Quest�o 21
	public void imprimeImparesAlter(int y) {
		double soma = 0;
		for (int i = 1; i == y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
				System.out.println(soma);
			}
		}
	}

	// Quest�o 22
	public void imprimeSequencia(int y) {
		for (int i = 1; i == y; i++) {
			if (i % 3 != 0 || i == 1) {
				System.out.println(i + " ");
			} else
				System.out.println(i + 2 + " ");
		}
	}

	// Quest�o 23
	public void imprimeVet50() {
		int[] vetor = {};
		for (int i = 1; i < 51; i++)
			vetor[i] = 1;
		for (int y : vetor) {
			System.out.println(y + " ");
		}
	}

	// Quest�o 24
	public void imprimeVet1100Par() {
		int[] vetor = {};
		for (int i = 1; i < 100; i++)
			if (i % 2 == 0)
				vetor[vetor.length - 1] = i;
		for (int y : vetor) {
			System.out.println(y + " ");
		}
	}

	// Quest�o 25
	public void imprimeVet100Impar() {
		int[] vetor = {};
		int i = 0;
		while (vetor.length < 101) {
			if (i % 2 != 0)
				vetor[vetor.length - 1] = i;
		}
		i++;
		for (int y : vetor) {
			System.out.println(y + " ");
		}
	}

	Scanner leia = new Scanner(System.in);

	// Quest�o 26
	public void imprimeVet10Half() {
		double[] vetor = {};
		for (int i = 0; i < 10; i++)
			vetor[i] = (leia.nextDouble() / 2);
		for (double y : vetor)
			System.out.println(y + " ");
	}

	// Quest�o 27
	public void imprimeMat5x5() {
		int[][] matriz = new int[5][5];
		int i = 1;
		for (int x[] : matriz)
			for (int y : x) {
				y = i;
				i++;
			}
		for (int x[] : matriz) {
			for (int y : x)
				System.out.printf("%d ", y);
			System.out.printf("\n");
		}
	}

	// Quest�o 28
	public void imprimeSomaMatrizes() {
		int[][] matrizA = new int[4][4];
		int[][] matrizB = new int[4][4];
		int[][] matrizSOMA = new int[4][4];
		for (int x[] : matrizA)
			for (int y : x) {
				y = leia.nextInt();
			}
		for (int x[] : matrizB)
			for (int y : x) {
				y = leia.nextInt();
			}
		for (int i = 0; i < matrizSOMA.length; i++)
			for (int j = 0; j < matrizSOMA[i].length; j++) {
				matrizSOMA[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		for (int x[] : matrizSOMA) {
			for (int y : x)
				System.out.printf("%d ", y);
			System.out.printf("\n");
		}
	}

	// Quest�o 29
	public void imprimeVendas(double[][] vendas) {
		double somaMes[] = {}, somaSemana[] = {}, somaAno = 0;
		for (int i = 0; i < vendas.length; i++) {
			for (int j = 0; j < vendas[i].length; j++) {
				somaMes[j] = +vendas[i][j];
				somaSemana[i] = +vendas[j][i];
				somaAno = +vendas[i][j];
			}
		}
		for (double y : somaMes)
			System.out.printf("%d ", y);
		for (double y : somaSemana)
			System.out.printf("%d ", y);
		System.out.printf("%d ", somaAno);
	}

	// Quest�o 30
	public String imprimeMes(int x) {
		String[] meses = { "janeiro", "fevereiro", "mar�o", "abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro", "dezembro" };
		if (x - 1 > -1 && x - 1 < meses.length + 1)
			return String.format("O m�s %d � %s", x, x - 1);
		else
			return String.format("Valor incorreto");
	}

	public void recebeMes() {
		imprimeMes(leia.nextInt());
	}

	// Quest�o 31
	public String imprimeCabecalho(String nome) {
		return String.format(
				"============================================\r\n" + "UFMG � Universidade Federal de Minas Gerais\r\n"
						+ "ICEx � Instituto de Ci�ncias Exatas\r\n" + "Disciplina de Programa��o de Computadores\r\n"
						+ "Nome: %s\r\n" + "============================================ ,",
				nome);
	}

	// Quest�o 32
	public int verifAlfabeto(String c) {
		/*
		 * Lucas, n�o consegui encontrar um grupo em regex que inclua pontua��o da nossa
		 * l�ngua, ou melhor, encontrei um script que na teoria deveria funcionar, o
		 * \p{IsLatin}, mas na pr�tica n�o consegui reconhecer '�', '�' e etc, eu sei
		 * que d� pra converter char em int e comparar com ASCII, mas tentei usar regex
		 * por ser mais divertido
		 */
		if (Pattern.compile("\\w\\D").matcher(c).find() && c.length() == 1)
			return 1;
		else
			return 0;

	}

	// Quest�o 33

	public int verifCapicua(String n) {
		String verificador = "\\d+";
		if (n.matches(verificador)) {
			for (int i = 1; i <= (n.length() / 2); i++) {
				if (n.charAt(i - 1) != n.charAt(n.length() - i))
					return 0;
			}
			return 1;
		} else
			return 0;
	}

	// Quest�o 34
	public double imprimeMenorValor(double x, double y) {
		if (x > y)
			return y;
		else
			return x;
	}

}
