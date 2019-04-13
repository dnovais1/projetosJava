package entities;

public class Produtos {
	private String nome;
	private double preco;
	private int qtde;
	
	//criando o construtor da classe
	
	public Produtos(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	
	public double totalValor() {
		return preco * qtde;
	}
	
	public void adicionarProduto(int qtde) {
		this.qtde += qtde;
	}
	
	public void removerProduto (int qtde) {
		this.qtde -= qtde;
	}
	
	public String toString() {
		return nome
				+", R$ "
				+String.format("%.2f", preco)
				+", "+qtde+" Unidades, Total: "
				+String.format("%.2f",totalValor());
	}
	
	
	
	
}
