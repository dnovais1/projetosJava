package entities;

public class Funcionario {

	public String nome;
	public double salario;
	public double taxa;
	
	public double AddSalario() {
		return salario - taxa;
	}



}
