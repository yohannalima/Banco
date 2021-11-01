package br.com.banco;

import java.time.LocalDate;

public abstract class Conta {
	
	private int idConta;
	private int idPessoa;
	private double saldo;
	private double limiteSaqueDiario;
	private boolean flagAtivo;
	private int tipoConta; // 1- Corrente  2- Poupança
	private LocalDate dataCriacao;
	
	public Conta (int idConta, int idPessoa) {
		this.idConta = idConta;
		this.idPessoa = idPessoa;
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		if (valorSaque <= saldo) {
			saldo -= valorSaque;
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	

	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public int getidPessoa() {
		return idPessoa;
	}
	public void setdPessoa(int dPessoa) {
		this.idPessoa = dPessoa;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteSaqueDiario() {
		return limiteSaqueDiario;
	}
	public void setLimiteSaqueDiario(double limiteSaqueDiario) {
		this.limiteSaqueDiario = limiteSaqueDiario;
	}
	public boolean isFlagAtivo() {
		return flagAtivo;
	}
	public void setFlagAtivo(boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}
	
	public String getTipoConta() {
		if (tipoConta == 1) {
			return "Conta Corrente";
		}else {
			return "Conta Poupança";
		}
	}
	
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public LocalDate getDataCriacao() {
		LocalDate todaysDate = LocalDate.now();
        dataCriacao = (todaysDate);
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	
	
}
