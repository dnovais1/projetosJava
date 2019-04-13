package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula41_doWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.print("Digite um Numero:");
			double num = sc.nextFloat();
			double raiz = Math.sqrt(num);
			System.out.printf("Raiz Quadrada = %.3f%n", raiz);

			System.out.println("Deseja Repetir (s ou n?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}
