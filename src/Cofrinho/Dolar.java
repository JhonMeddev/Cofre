package Cofrinho;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);		
	}
	
	@Override
	double converter() {
		double valorConvertido = valor / 5.12;
		return valorConvertido;
	}
	
	@Override
	double info() {
		System.out.println("O valor em Dolar é: $" + converter() );
		return converter();
	}

	@Override
	public String toString() {
		return "Valor em REAL:" + valor + info();
	}
	
	

}
