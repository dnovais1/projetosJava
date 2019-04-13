package course;

public class Aula27_FuncoesComString {

	public static void main(String[] args) {

		System.out.println("Aprendendo Funções com String");
		
		String texto = " abcd EFG HijL amnoo  ";
		
		String a1 = texto.toLowerCase(); // convert string para minuscula
		String a2 = texto.toUpperCase(); // convert string para maiusculo
		String a3 = texto.trim(); // Tira espaços das estremidades do texto
		String a4 = texto.substring(4); // Copia do valor para frente.
		String a5 = texto.substring(0,4); // Copia do valor para frente.
		String a6 = texto.replace('a', 'x'); // substituir a por x
		int i = texto.indexOf("cd");

		System.out.println("Original: "+"-"+texto+"-");
		System.out.println("toLowerCase: "+"-"+a1+"-");
		System.out.println("toUpperCase: "+"-"+a2 +"-");
		System.out.println("Trim: "+"-"+a3 +"-");
		System.out.println("substring: "+"-"+a4 +"-");
		System.out.println("substring: "+"-"+a5 +"-");
		System.out.println("Replace a por x:"+a6+"-");
		System.out.println("Posição do texto:"+i);

	}

}
