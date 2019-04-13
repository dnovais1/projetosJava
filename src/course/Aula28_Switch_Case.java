package course;

import java.util.Scanner;

public class Aula28_Switch_Case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		default:
			dia = "Dia Invalido";
		}
		
		System.out.println("O Dia escolhido foi "+dia);

		sc.close();

	}

}
