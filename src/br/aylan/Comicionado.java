package br.aylan;

public class Comicionado extends Empregado {
private Double totalVenda;
private Double totalComissao;
@Override
public Double vencimento() {
	// TODO Auto-generated method stub
	return totalVenda*totalComissao;
}
public Double getTotalVenda() {
	return totalVenda;
}
public void settotalVenda (Double totalVenda) {
	this.totalVenda = totalVenda;
}
public Double getTotalComissao() {
	return totalVenda;
}
public void setTotalComissao (Double totalComissao) {
	this.totalComissao = totalComissao;
}
}
