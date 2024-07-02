package br.aylan;

public class Programa {
public static void main(String args[]) {
	Assalariado empregado = new Assalariado();
	empregado.setCpf("1");
	empregado.setNome("Aylan");
	empregado.setSobrenome("Moura");
	empregado.setSalario(1000d);
	imprimir(empregado);
	
	Comicionado comicionado = new Comicionado();
	comicionado.setCpf("1");
	comicionado.setNome("Moura");
	comicionado.setSobrenome("Moura");
	comicionado.settotalVenda(100d);
	comicionado.setTotalComissao(25d);
	imprimir(comicionado);
	
	Horista horista = new Horista();
	horista.setCpf("1");
	horista.setNome("Sousa");
	horista.setSobrenome("Moura");
	horista.setPrecoHora(100d);
	horista.setTotalHoraTrabalhada(10d);
	imprimir(horista);
}
public static void imprimir(Empregado empregado) {
	System.out.println(empregado.getNome() + " Tem salario " + empregado.vencimento());
}

}
