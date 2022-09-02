package exercicio4_vetor;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int vpar = 0;
		int vimpar = 0;
		final int TAM = 20;
		int k;

		int[] num = new int[TAM];

		for (k = 0; k < TAM; k++) {
			System.out.println("Insira 20 números: ");
			num[k] = entrada.nextInt();
		}

		System.out.print("Números armazenados no vetor:\n ");
		for (k = 0; k < TAM; k++) {
			if (num[k] % 2 == 0) {
				vpar++;

			} else if (num[k] % 2 != 0) {
				vimpar++;
			}
			System.out.print(num[k] + " ");

		}

		int[] par = new int[vpar];
		int[] impar = new int[vimpar];

		int npar = 0;
		int nimpar = 0;

		for (k = 0; k < TAM; k++) {
			if (num[k] % 2 == 0) {
				par[npar] = num[k];
				npar++;
			} else if (num[k] % 2 != 0) {
				impar[nimpar] = num[k];
				nimpar++;
			}
		}
		System.out.println();
		System.out.print("Números armazenados no vetor dos pares:\n ");
		for (int i : par) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Números armazenados no vetor dos Impares:\n ");
		for (int i : impar) {
			System.out.print(i + " ");
		}

		entrada.close();
	}

}
