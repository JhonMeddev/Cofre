package Cofrinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar (Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover (Moeda moeda) {
		listaMoedas.remove(moeda);
	}

	public void listar () {
		
		for (Moeda m : listaMoedas) {
			System.out.println(m.toString());
		}
	}
	
	public double totalConvertido() {
		return 0;		
	}
}
