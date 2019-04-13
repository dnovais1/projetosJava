package course;

import java.util.Scanner;

public class Aula40_For_e_While {

	public static void main(String[] args) {
	
		System.out.print("Digite um numero > 0:");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maior = 0;
		
		while(n <= 0) {
			System.out.print("Tente Novamente:");
			n = sc.nextInt();
		}
		
		for(int x = 1; x <= n ; x++) {
			System.out.print("Valor #"+x+":");
			int aux = 0;
			aux = sc.nextInt();
			if(aux > maior) {
				maior = aux;
			}
		}
		
		System.out.println("O Maior foi:"+maior);
		sc.close();

	}

}
