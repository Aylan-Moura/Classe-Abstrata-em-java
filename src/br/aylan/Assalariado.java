package br.aylan;

public class Assalariado extends Empregado { /* extends faz a classe herda de empregado*/
	private Double salario;
	
public Double getSalario() {
	return salario;
}
public void setSalario (Double salario) {
	this.salario = salario;
}

@Override
	public Double vencimento() {
		// TODO Auto-generated method stub
		return salario;
		}
}
