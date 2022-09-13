package Exercicio_2;

public class Banco {
	
	public static void main(String[] args) {
	
	System.out.println("Opções de operações: ");
	System.out.println("1- Depósito ");
	System.out.println("2- Transferência");
	System.out.println("3- Mostrar saldo ");
	
	SistemaBancario cliente1 = new SistemaBancario ("Fernando", 1234 , 2);
	
	cliente1.imprimir();
	cliente1.saldoFinal();
	
	SistemaBancario cliente2 = new SistemaBancario ("Maria", 1234 , 1);
	
	cliente2.imprimir();
	cliente2.saldoFinal();
	
	SistemaBancario cliente3 = new SistemaBancario ("Joao", 1234 , 0);
	
	cliente3.imprimir();
	cliente3.saldoFinal();
	
SistemaBancario cliente4 = new SistemaBancario ("Maria", 1234 , 4);
	
	cliente4.imprimir();
	cliente4.saldoFinal();
	cliente4.setOperacao(1);
	
	
	
	
	
	}
}
