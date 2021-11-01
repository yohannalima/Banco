package br.com.banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Transacoes extends Conta {
	
	private ArrayList<Double> extratoValor = new ArrayList<Double>();
	private ArrayList<LocalDate> extratoData = new ArrayList<LocalDate>();

	private int idTransacao;
	private double valor;
	private LocalDate dataTransacao;
	
	public Transacoes(int idConta, int idPessoa) {
		super(idConta, idPessoa);
		
	}
	
	public void depositar(double valorDeposito) {
		setSaldo(valorDeposito);
		extratoValor.add(valorDeposito);
		extratoData.add(getDataTransacao());
	}
	
	public void sacar(double valorSaque) {
		if (valorSaque <= getSaldo()) {
			setSaldo(-valorSaque);
			extratoValor.add(-valorSaque);
			extratoData.add(getDataTransacao());
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void extrato() {
		for (Double valor : extratoValor) {
			for (LocalDate localDate : extratoData) {
				System.out.println("R$ "+ valor + " " + localDate);
				break;
			}
		}
	}


	public int getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getDataTransacao() {
		LocalDate todaysDate = LocalDate.now();
        dataTransacao = (todaysDate);
		return dataTransacao;
	}
	public void setDataTransacao(LocalDate dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
}
