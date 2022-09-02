package exercicio4_vetor;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		final int valuno = 10;
		final int vnota = 4;
		int i = 0;
		int x;
		int alunos = 0;
		float media = 0, soma = 0;

		for (i = 0; i < valuno; i++) {
			System.out.println("Insira as quatro notas desse aluno!");

			float nota[] = new float[vnota];
			for (x = 0; x < vnota; x++) {
				System.out.printf("Nota " + (x + 1) + ": ");
				nota[x] = entrada.nextFloat();
				soma = soma + nota[x];
			}

			media = soma / vnota;
			soma = 0;
			System.out.println("A média desse aluno: " + media);

			if (media >= 7) {
				alunos++;
			}
		}
		System.out.println("O número de alunos com média maior ou igual a 7.0 : " + alunos);

		entrada.close();
	}

}
