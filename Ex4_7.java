package exercicio4_vetor;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int vetor[] = new int[5];
		int i;
		int mult = 1;
		int soma = 0;

		for (i = 0; i < 5; i++) {
			System.out.printf("Insira um número inteiro: ");
			vetor[i] = entrada.nextInt();
		}

		for (i = 0; i < 5; i++) {
			System.out.print(vetor[i] + "|");
			soma = soma + vetor[i];
			mult = mult * vetor[i];
		}

		System.out.println("A somatoria dos 5 números foi: " + soma);
		System.out.println("A multiplicação dos 5 números foi: " + mult);

		entrada.close();
	}

}
