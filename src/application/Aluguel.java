package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Aluguel {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Quartos[] aluguel = new Quartos[10];

		int qtde = sc.nextInt();
		
		for(int i = 0; i < qtde; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			String email = sc.nextLine();
			int quarto = sc.nextInt();

			aluguel[quarto] = new Quartos(nome,email);
		}
		
		for(int i = 0; i < 10; i++) {
			if(aluguel[i] != null) {
				System.out.println("#"+i+":");
				System.out.println(aluguel[i]);
			}
		}
		
		
		sc.close();

	}

}
