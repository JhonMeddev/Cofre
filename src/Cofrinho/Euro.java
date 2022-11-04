package Cofrinho;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		
	}
	
	@Override
	double converter() {
		double valorConvertido = valor / 4.99;
		return valorConvertido;
	}
	
	@Override
	double info() {
		System.out.println("O valor em Euro é : €" + converter() );
		return converter();
	}

	@Override
	public String toString() {
		return "Valor em REAL:" + valor + info();
	}
}
