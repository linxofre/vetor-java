package exercicio4_vetor;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

			
		int vetor[] = new int[5];
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println("Insira um número inteiro: ");
			vetor[i] = entrada.nextInt();
		}
		for (i = 0; i < 5; i++) {
			System.out.print(vetor[i] + " | ");
				
		}	
		entrada.close();
	}

}
