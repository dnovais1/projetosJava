package application;

public class ForEach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Daniel", "Shirlei", "Maria", "José" };

		for (int x = 0; x < vect.length; x++) {
			System.out.println(vect[x]);
		}
		
		System.out.println("----------------------------------");
		
		for(String nomes : vect) {
			System.out.println(nomes);
		}
		
		
	}

}
