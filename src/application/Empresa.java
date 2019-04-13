package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Empresa {
	public static void main(String[] args) {
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Entre com os dados do produto");
		 
		 System.out.print("Descrição:");
		 String nome = sc.nextLine();
		 
		 System.out.print("Preço:");
		 double preco = sc.nextDouble();
		 
		 System.out.print("Estoque:");
		 int qtde = sc.nextInt();
		 
		 Produtos prod = new Produtos(nome, preco, qtde);
		 
		 prod.setNome("Moto G7"); //SET PARA ATRIBUIR VALOR
		 System.out.println("Nome Atualizado: " + prod.getNome()); // GET PARA PEGAR VALOR
		 
		 System.out.println();
		 System.out.println("Dados do Produto: "+prod);

		 System.out.println();
		 System.out.println("Informe qtde a ser incluida no estoque: ");
		 qtde = sc.nextInt();
		 prod.adicionarProduto(qtde);
		 
		 System.out.println();
		 System.out.println("Dados atualizados: "+prod);
		 
		 System.out.println();
		 System.out.println("Informe qtde a ser excluida no estoque: ");
		 qtde = sc.nextInt();
		 prod.removerProduto(qtde);

		 System.out.println();
		 System.out.println("Dados atualizados: "+prod);
		 
		 sc.close();
	}

}
