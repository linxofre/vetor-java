package exercicio4_vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira várias palavras separadas: ");
		String palavra = entrada.next();
		String separar[] = palavra.split(";");

		System.out.println(Arrays.toString(separar));

		entrada.close();
	}

}
