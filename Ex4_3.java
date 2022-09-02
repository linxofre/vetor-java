package exercicio4_vetor;

import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float n[] = new float[4];
		float soma = 0;
		float media;

		for (int i = 0; i < 4; i++) {
			System.out.println("Insira a nota: ");
			n[i] = entrada.nextFloat();
			soma = soma + n[i];
		}
		media = soma / 4;

		System.out.println("A média das notas: " + media);

		entrada.close();
	}

}
