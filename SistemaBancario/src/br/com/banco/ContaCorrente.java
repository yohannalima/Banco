package br.com.banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int idConta, int idPessoa) {
		super(idConta, idPessoa);
		setTipoConta(1);
	}

}
