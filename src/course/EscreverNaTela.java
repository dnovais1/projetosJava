package course;

import java.util.Locale;

public class EscreverNaTela {

	public static void main(String[] args) {

		char genero = 'F';
		int idade = 34;
		double saldo = 10.35789;
		String nome = "Maria";

		System.out.print("Bom Dia");
		System.out.println("Boa Tarde");
		System.out.println("Boa Noite");
		System.out.println("------------------------------");
		System.out.printf("%.1f%n", saldo);// %n para quebrar a linha
		System.out.printf("%.2f%n", saldo);
		Locale.setDefault(Locale.US); //Locate muda configuração local, formatando casa decimal do float.
		System.out.printf("%.2f%n", saldo);
		System.out.println("------------------------------");
		System.out.printf("%s tem %d anos, sexo %c, e tem saldo de %.2f Reais%n",nome,idade,genero,saldo);
	}

}
