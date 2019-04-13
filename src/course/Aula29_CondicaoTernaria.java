package course;

public class Aula29_CondicaoTernaria {

	public static void main(String[] args) {

       double preco = 34.5;
       double desconto;
       
       desconto = (preco > 20) ? preco * 0.1 : preco * 0.05;
       
       System.out.println(desconto);

	}

}
