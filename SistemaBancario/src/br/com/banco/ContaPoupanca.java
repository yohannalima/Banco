package br.com.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int idConta, int idPessoa) {
		super(idConta, idPessoa);
		setTipoConta(2);
	}

}
