package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula24_If_e_else {

	public static void main(String[] args) {
		
		int num1,num2;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Numero.");
		num1 = sc.nextInt();
		System.out.println("Digite outro Numero");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.printf("%d é maior do que %d",num1,num2);
		}else{
			System.out.printf("%d é maior do que %d",num2,num1);
		}
		
		sc.close();

	}

}
