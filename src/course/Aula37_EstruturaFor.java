package course;

import java.util.Scanner;

public class Aula37_EstruturaFor {

	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Quantos numeros vc vai digitar?");
            int n = sc.nextInt();
            int sum = 0;
            
            for(int i = 1; i <=5; i++) {
               System.out.print("Valor #"+i+":");
            	int x = sc.nextInt();
               sum += x;
            }
            
            System.out.println("Soma total:"+sum);
            
            sc.close();

	}

}
