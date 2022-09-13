package Exercicio_1;

public class clientesLojas {

	public static void main(String[] args) {

		Clientes cliente1 = new Clientes ("Fernanda","fernanda@gmail.com","Caderno", 23 , 2 , 456);

		cliente1.ImprimirInfos();
		cliente1.calcularDesconto();

		Clientes cliente2 = new Clientes ("Júlia","julia@gmail.com","Lápis", 5 , 1 , 345);
		System.out.println("\n\n\n\n\n\n");
		cliente2.ImprimirInfos();
		cliente2.calcularDesconto();
	}

}
