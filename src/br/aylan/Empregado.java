package br.aylan;

public abstract class Empregado { /* toda classe Pai tem que ter o abstract*/
private String nome;
private String sobrenome;
private String cpf;
public abstract Double vencimento();

public String getNome() {
	return nome;
}
public void setNome (String nome) {
	this.nome = nome;
}	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome (String sobrenome) {
		this.sobrenome = sobrenome;
}
	public String getCpf() {
		return cpf;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
}