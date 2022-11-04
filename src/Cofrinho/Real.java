package Cofrinho;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
		
	}
	
	@Override
	double converter() {
		double valorConvertido = valor * 1;
		return valorConvertido;
	}
	
	@Override
	double info() {
		System.out.println("O valor em Real é: R$" + converter() );
		return converter();
	}
	
	@Override
	public String toString() {
		return "Valor em REAL:" + valor + info();
	}
}

