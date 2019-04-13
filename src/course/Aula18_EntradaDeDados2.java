package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula18_EntradaDeDados2 {

	public static void main(String[] args) {

     Locale.setDefault(Locale.US); //define a região
     
     Scanner sc= new Scanner(System.in);
     System.out.println("Digite um Numero:");
     int n1 = sc.nextInt();
     System.out.println(n1);
     
     System.out.println("Digite seu Nome:");
     sc.nextLine();// limpa a leitura de linha anterior flush
     String nome = sc.nextLine();
     System.out.println(nome);
     
     System.out.println("Digite sexo:");
     char genero = sc.next().charAt(0);
     System.out.println(genero);
     
     System.out.println("Digite B5");
     String s = sc.next();
     char letra = s.charAt(0); 
     int numero = Integer.parseInt(s.substring(1));
     System.out.println(letra);
     System.out.println(numero);
     
     System.out.println("Digite Maria F 23 1.68");
     String texto = sc.next();
     char ch = sc.next().charAt(0);
     int idade = sc.nextInt();
     double tamanho = sc.nextDouble();
     
     System.out.println(texto);
     System.out.println(ch);
     System.out.println(idade);
     System.out.println(tamanho);
     
     
     sc.close();

	}

}
