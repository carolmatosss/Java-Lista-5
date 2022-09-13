package Exercicio_2;

import java.util.Scanner;

public class SistemaBancario {

	private String cliente;
	private double saldo;
	private int operacao;


	public SistemaBancario (String cliente, double saldo_i, int operacao ) {



		this.cliente=cliente;
		this.saldo=saldo_i;
		this.operacao=operacao;	
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getOperacao() {
		return operacao;
	}


	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public void imprimir () {

		System.out.println("\n\n\nBem vindo "+cliente+" seu saldo é: R$ "+saldo);
	}
	
	public void saldoFinal () {

		Scanner leia =new Scanner (System.in);
		
		double transferencia, deposito,saldo_f=0;

		if (operacao==1) {
			System.out.println("A opção selecionada foi depósito. \n");
			System.out.println("Insira o valor depósito: R$ ");
			deposito = leia.nextFloat();
			saldo_f = saldo+deposito;		
		}
		
		else if (operacao==2) {
			System.out.println("A opção selecionada foi transferência. \n");
			System.out.println("Insira o valor tranferência: R$ ");
			transferencia = leia.nextFloat();
			saldo_f = saldo-transferencia;		
		}
		
		else if (operacao==0) {
			System.out.println("A opção selecionada foi ver saldo. \n");
			System.out.println("Seu saldo é: R$  "+saldo);

		}else {
			System.out.println("Opção iválida");
		}

		System.out.printf("Seu saldo final é: R$ %.2f ",saldo_f,"\n\n");
	}

}

