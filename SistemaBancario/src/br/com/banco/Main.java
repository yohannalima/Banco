package br.com.banco;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente novaConta = new ContaCorrente(123, 321);
		System.out.println(novaConta.getTipoConta());
		
		novaConta.depositar(150);
		System.out.println(novaConta.getSaldo());
		
		novaConta.sacar(200);
		

	}

}
