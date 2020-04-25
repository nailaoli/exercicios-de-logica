// Write a method that returns the sum of all even Fibonacci numbers.
// Consider all Fibonacci numbers that are less than or equal to n.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EvenFibonacciSum {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(fibonacciSumLesser(n));
    System.out.println(evenFibonacciSum(n));
	}

	/**
	 * Retorna a soma de todos os elementos pares de Fibonacci enquanto o
   * elemento for menor ou igual a n.
	 */
	public static long fibonacciSumLesser(int n) {

		if (n <= 1)
			return 0;

		List<Integer> fibo = new ArrayList<Integer>();
		fibo.add(1);
		fibo.add(1);

		long soma = 0;
		Integer elementoAtual = fibo.get(fibo.size() - 1) + fibo.get(fibo.size() - 2);

		while (elementoAtual <= n) {
			if (elementoAtual % 2 == 0) {
				soma += elementoAtual;
			}
			fibo.add(elementoAtual);
			elementoAtual = fibo.get(fibo.size() - 1) + fibo.get(fibo.size() - 2);
		}

		return soma;

		// Utilizando um array:
		// int[] fibo = new int[n];
		// long soma = 0;
		// fibo[0] = 1;
		// fibo[1] = 1;
		//
		//
		// for (int i=2; fibo[i-1] < n; i++){
		// fibo[i] = fibo[i-1] + fibo[i-2];
		// if ((fibo[i]%2==0) && (fibo[i] <= n)){
		// soma += fibo[i];
		// }
		// }
		// return soma;
	}

  /**
	 * Retorna a soma de todos os elementos pares de Fibonacci até o elemento n.
	 */
	public static long evenFibonacciSum(int n) {

		if (n <= 1)
			return 0;

		int[] fibo = new int[n];
		long soma = 0;

		fibo[0] = 1;
		fibo[1] = 1;

		for (int i = 2; i < n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			if (fibo[i] % 2 == 0) {
				soma += fibo[i];
			}
		}

		return soma;
	}

}
