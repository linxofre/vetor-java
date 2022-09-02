package exercicio4_vetor;

import java.util.Scanner;

public class Ex4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int i = 0;
		int k = 0;
		int vetor[] = new int[10];
		int segundovetor[] = new int[10];
		int terceirovetor[] = new int[20];

		for (i = 0; i < 10; i++) {
			System.out.println("Insira um número para compor o primeiro vetor : ");
			vetor[i] = Integer.parseInt(entrada.nextLine());
		}
		for (i = 0; i < 10; i++) {
			System.out.println("Insira um número para compor o segundo vetor : ");
			segundovetor[i] = Integer.parseInt(entrada.nextLine());
		}
		for (i = 0; i < 10; i++) {
			terceirovetor[k] = vetor[i];
			k++;
			terceirovetor[k] = segundovetor[i];
			k++;
		}
		System.out.println("O vetor 3 será compostos pelos elementos: ");
		for (i = 0; i < 20; i++) {
			System.out.println(terceirovetor[i]);
		}
		entrada.close();
	}

}
