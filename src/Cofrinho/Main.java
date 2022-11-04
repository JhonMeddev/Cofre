package Cofrinho;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int menu;
		
		Cofrinho cofre = new Cofrinho();
		
		System.out.println("Menu Cofrinho");
		System.out.println("1- Adicionar");
		System.out.println("2- Remover");
		System.out.println("3-Listar");
		System.out.println("4-Encerrar");
		menu=input.nextInt();
		
		while(menu != 4) {
			
			switch (menu) {
			case 1: 
				int tipoMoeda=0;
				while(tipoMoeda > 3 || tipoMoeda <=0) {
					System.out.println("1- Real");
					System.out.println("2- Dolar");
					System.out.println("3- Euro");
					tipoMoeda = input.nextInt();
				}
				System.out.println("Qual Valor ?");
				double valor = input.nextDouble();
				
				Moeda moeda = null;
				if(tipoMoeda==1){
					moeda = new Real(valor);
				}
				else if(tipoMoeda==2){
					moeda = new Dolar(valor);
				}
				else if(tipoMoeda==3){
					moeda = new Euro(valor);
				}
				cofre.adicionar(moeda);
				break;
			case 2: 
				//remover
				break;
			case 3: 
				cofre.listar();
				break;
			default:
				System.out.println("Opção Invalida");
				
			}
			
			System.out.println("Menu Cofrinho");
			System.out.println("1- Adicionar");
			System.out.println("2- Remover");
			System.out.println("3-Listar");
			System.out.println("4-Encerrar");
			menu=input.nextInt();
		}
	}

}
