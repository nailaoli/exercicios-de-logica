import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

	static long calcularSoma(int n) {

		if (n <= 0)
			throw new InputMismatchException("O número inserido é inválido");

		if (n == 1)
			return 1;

		long fibonacci[] = new long[n];
		fibonacci[0] = 1L;
		fibonacci[1] = 1L;

		long soma = fibonacci[0] + fibonacci[1];

		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			soma += fibonacci[i];
		}

		return soma;
	}


	static double calcularMedia(int n) {
		return (double) calcularSoma(n) / n;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean rodando = true;
		while (rodando) {
			try {
				System.out.print("Digite o número de elementos do Fibonacci: ");
				int numero = sc.nextInt();
				System.out.println("SOMA: " + calcularSoma(numero));
				System.out.println("MÉDIA: " + calcularMedia(numero));
				rodando = false;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.hasNextLine();
			}
		}
		sc.close();
	}
}
