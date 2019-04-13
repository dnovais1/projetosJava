package course;

import java.util.Scanner;

public class Aula24_EstruturaCondicional {

	public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   
   System.out.println("Digite um Numero:");
   int num1 = sc.nextInt();
   
   if(num1 % 2 == 0) {
	   System.out.printf("%d é um numero Par!",num1);
   }else {
	   System.out.printf("%d é um numero impar",num1);
   }
   
   int num2 = sc.nextInt();
   int num3 = sc.nextInt();
   int num4 = sc.nextInt();
   
   if(num2 > num3) {
	   System.out.printf("%d é maior!",num2);
   }else if (num3 > num4) {
	   System.out.printf("%d é maior",num3);
   }else {
	   System.out.printf("%d é maior",num4);
   }
   
   
   sc.close();
   

	}

}
