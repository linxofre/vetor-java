package exercicio4_vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um texto: ");
		String text = entrada.nextLine();

		char letras[] = new char[text.length()];

		for (int k = 0; k < letras.length; k++) {
			letras[k] = text.charAt(k);
		}

		System.out.println(Arrays.toString(letras));
		
		entrada.close();
	}

}
