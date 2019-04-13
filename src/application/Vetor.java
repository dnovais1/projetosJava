package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores?");
		
		int n = sc.nextInt();		
		double[] altura = new double[n];
		
		for(int a = 0; a < n; a++) {
			altura[a] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int a = 0; a < n; a++) {
			sum += altura[a];
		}
		
		double media = sum / n;
		
		System.out.printf("A Médias das alturas é: %.2f%n",media);
		
		
		

		sc.close();

	}

}
