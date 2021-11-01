package br.com.banco;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente novaConta = new ContaCorrente(123, 321);
		System.out.println(novaConta.getTipoConta());
		
		Transacoes novasTransacoes = new Transacoes(123, 321);
		novasTransacoes.depositar(100);
		novasTransacoes.sacar(50);
		novasTransacoes.depositar(50);
		novasTransacoes.extrato();

	}

}
