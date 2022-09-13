package Exercicio_1;

public class Clientes {
	//Declarando atributos
	private String nome;
	private String email;
	private String produto;
	private float valor;
	private int planoFidelidade;
	private int cpfCliente;

	//Definindo parâmetros
	public Clientes (String nomeCliente, String emailCliente, String produtoAdquirido, float valorGasto, int planoFidelidade, int cpfCliente ) {

		this.nome = nomeCliente;
		this.email = emailCliente;
		this.produto = produtoAdquirido;
		this.planoFidelidade = planoFidelidade;
		this.cpfCliente = cpfCliente;
		this.valor=valorGasto;


	}
	//Gets and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}


	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setPlanoFidelidade(int planoFidelidade) {
		this.planoFidelidade = planoFidelidade;
	}

	public void ImprimirInfos() {
		System.out.println ("Cliente: "+nome);
		System.out.println ("\ne-mail: "+email);
		System.out.println ("Comprou: "+produto);
		System.out.println ("Valor: R$ "+valor);
		System.out.println ("Número plano fidelidade: "+planoFidelidade);
		System.out.println ("CPF "+cpfCliente);
	}

	public void calcularDesconto() {
		float valorT;

		if (planoFidelidade==2) {
			valorT=valor-20;	
			System.out.println("Cliente com desconto. Valor final: R$ "+valorT);

		}else
			System.out.println("Cliente sem desconto");

	}


}
