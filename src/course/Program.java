package course;

public class Program {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		boolean completed = false; // variavel completed do tipo booleano
		char genero = 'F';
		byte n1 = 10; // varival x do tipo byte
		int n2= 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L; // colocar L no final de um tipo logn
		float n5 = 4.5f; //colocar f no final de um tipo float
		double n6 = 4.5;
		
		Object obj1 = "Daniel Novais"; //
		
		System.out.println(completed);
		System.out.println(genero);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(obj1);
		
		
		System.out.println("----------------- ESTUDOS DE CASTING -----------------------------------");
		
		double a;
		float b;
		
		a = 5.0;
		b = (float) a;//o casting convert a double para float
		
		System.out.println(b);

		System.out.println("------------------ESTUDOS DE CASTING----------------------------------");
		
		double c;
		int d;
		
		c = 5.5;
		d = (int)c; // o casting de double para int perde as casasa decimais.
		
		System.out.println(d);
		
		System.out.println("------------------ESTUDOS DE CASTING----------------------------------");
		
		int num1,num2;
		double result, result2;
		String s = "33";
		
		num1 = 5;
		num2 = 2;
		
		num1 = Integer.parseInt(s);// Funcão que converte para inteiro
		
		result = (double) num1 / num2;
		
		result2 = Double.parseDouble(s); // Funçao que converte para double
		
		System.out.println(result);
		System.out.println(result2);

	}

}
