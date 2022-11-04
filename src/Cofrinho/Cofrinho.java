package Cofrinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cofrinho {
	
	ArrayList<Moeda> lista = new ArrayList<Moeda>();
	Scanner input = new Scanner(System.in);
	
	int menu = 0;
	double valor = 0.0;
	
	public void adicionarMoeda() {
		System.out.println("Qual moeda deseja adicionar: \n1 - Real\n2 - Dolar\n3 - Euro");
		menu = input.nextInt();
		System.out.println("Qual valor: ");
		valor = input.nextDouble();
		switch (menu) {
			case 1: 
				lista.add(new Real(valor));
				break;
			case 2:
				lista.add(new Dolar(valor));
				break;
			case 3:
				lista.add(new Euro(valor));
				break;
			default:
				System.out.println("Opção inválida !");
			}
				
		}

	
	public void removerMoeda() {
		System.out.println("Qual moeda deseja remover ? \n1 - Real\n2 - Dolar\n3 - Euro");
		menu = input.nextInt();
		System.out.println("Qual valor: ");
		valor = input.nextDouble();
		switch (menu) {
			case 1: 
				lista.remove(new Real(valor));
				break;
			case 2:
				lista.remove(new Dolar(valor));
				break;
			case 3:
				lista.remove(new Euro(valor));
				break;
			default:
				System.out.println("Opção inválida!");
		}
	}
	
	public void listaMoedas() {
		for(Moeda m : lista) {
			m.info();
		}
	}
	

	public void valorTotal() {		
		double total = 0;
		for(Moeda m : lista) {
			
			total += m.converter();
		}
		System.out.println("Total em reais R$: " + total);
		 
	}
}
