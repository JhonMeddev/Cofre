package Cofrinho;

import java.util.Objects;

public class Real extends Moeda {

	
	public Real(double valor) {
		super(valor);
	}	

	@Override
	public void info() {
		System.out.println("R$" + getValor()+ " Real");
		}
		
	double total = 0.0;
	@Override
	public double converter() {
		double total = getValor();
		return total;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(total);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Real other = (Real) obj;
		return Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}
}

