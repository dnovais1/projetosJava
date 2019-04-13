package application;

import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qtd Linhas:");
		int x = sc.nextInt();
		System.out.println("Qtd Colunas");
		int y = sc.nextInt();

		// Iniciar a matriz
		int[][] dados = new int[x][y];

		// escrever dados na matriz
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < dados[i].length; j++) {
				dados[i][j] = sc.nextInt();
			}
		}

		System.out.println("Procurar pelo numero?");
		int dado = sc.nextInt();

		// ler dados da matriz
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < dados[i].length; j++) {
				if (dados[i][j] == dado) {
					System.out.println("Posição: " + i + "," + j);
					
					System.out.println("Abaixo:" + dados[i+1][j]);
					System.out.println("Acima:" + dados[i-1][j]);
					System.out.println("Esquerda:" + dados[i][j-1]);
					System.out.println("Direita:" + dados[i][j+1]);
				};
			}
		}

		sc.close();

	}

}
