package Cofrinho;

public abstract class Moeda {

	double valor;	
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}

	abstract double info();
	
	abstract double converter();
}
