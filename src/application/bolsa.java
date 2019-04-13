package application;

import java.util.Scanner;

import entities.cotacao;

public class bolsa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
        System.out.println("Digite Cotação do dia.");
         cotacao.cotacao = sc.nextDouble();        
         
         System.out.println("Digite Valor a converter");
         cotacao.valor = sc.nextDouble();
         
         System.out.printf("Valor com Iof: %.2f%n",cotacao.converter());
         
        sc.close();
        
	}

}
