package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula34_estruturaWhile {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um Número: ");
		double n = sc.nextDouble();
		
		while(n > 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n",sr);
			System.out.print("Digite outro Numero: ");
			n = sc.nextDouble();
		}
		
		System.out.println("Numero Negativo!");
		
		sc.close();
		
	}

}
