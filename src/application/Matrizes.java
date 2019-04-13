package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qtde Linhas:");
		int x = sc.nextInt();
		System.out.println("Digite qtde Colunas:");
		int y = sc.nextInt();
		
		int [][] dados = new int[x][y];
		
		for(int linha = 0; linha < x; linha++) {
			for(int coluna = 0;coluna < y; coluna++) {
				dados[linha][coluna] =  sc.nextInt();
			}
		}
		
		int cont = 0;
		
		for(int linha = 0; linha < x; linha++) {
			for(int coluna = 0;coluna < y; coluna++) {
				if (dados[linha][coluna] < 0) {
					cont += 1;
				}
			}
		}
		
		System.out.println("Negativos: " + cont);
		
		System.out.println("Diagonal Principal:");
		
		for(int i=0; i<x;i++) {
			System.out.println(dados[i][i]);
		}
		System.out.println();
		
		sc.close();

	}

}
