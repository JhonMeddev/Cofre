package Cofrinho;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
		
		public static void main(String[] args) {

			Cofrinho cofrinho = new Cofrinho();
			
			
		    Scanner input = new Scanner(System.in);
		    
		    //Menu 
		    int opcao;

            System.out.println("Menu cofrinho:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover uma Moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total em Reais");
            System.out.println("5 - Encerrar");

		        opcao = input.nextInt();

		        while(opcao != 5){
		            switch(opcao){
		                case 1:
		                    cofrinho.adicionarMoeda();
		                    break;
		                case 2:
		                    cofrinho.removerMoeda();
		                    break;
		                case 3:
		                    cofrinho.listaMoedas();
		                    break;
		                case 4:
		                    cofrinho.valorTotal();
		                    break;
		                default:
		                    System.out.println("Opção inválida!");
		            }

		            System.out.println("Menu cofrinho:");
		            System.out.println("1 - Adicionar Moeda");
		            System.out.println("2 - Remover uma Moeda");
		            System.out.println("3 - Listar moedas");
		            System.out.println("4 - Total em Reais");
		            System.out.println("5 - Encerrar");

		            opcao = input.nextInt();
		        }
		        input.close();
				

			}

}
