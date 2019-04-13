package entities;

public class cotacao {
  
	public static double cotacao;
	public static double valor;
	public static double iof = 6;
	
	public static double converter() {
		double total = valor * cotacao;
		return total + (total * iof / 100);
	}
	
}
