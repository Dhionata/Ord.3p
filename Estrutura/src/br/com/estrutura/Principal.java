package br.com.estrutura;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static long start = System.nanoTime(); // contador nano
	public static long start1 = System.currentTimeMillis(); // contador mili

	public static void main(String[] args) throws IOException {

		String[] English = ArquivoHandler.VetorCriar("./Linguagens/English.txt");

		String[] English_Canadian = ArquivoHandler.VetorCriar("./Linguagens/English (Canadian).txt");

		String[] English_South_African = ArquivoHandler.VetorCriar("./Linguagens/English (South African).txt");

		String[] Escolheu = {};

		String[] w = new String[Escolheu.length];

		Scanner entrada = new Scanner(System.in);

		int x;
		String procura;
		int ordenacao;
		int cod;
		
		do {
			System.out.println("\nEscolha o dicionario a ser utilizado: ");
			System.out.println("\n1 - English");
			System.out.println("\n2 - English (Canadian)");
			System.out.println("\n3 - English (South African)");
			
			x = entrada.nextInt();
			
			if(x == 1){
				Escolheu = English;
			}
			else if(x == 2) {
				Escolheu = English_Canadian;
			}
			else if(x == 3) {
				Escolheu = English_South_African;
			}
			
			if (x < 1 || x > 3) {
				do {
					System.out.println("C�digo errado, escolha entre esses idiomas.");
					System.out.println("\n1 - English");
					System.out.println("\n2 - English (Canadian)");
					System.out.println("\n3 - English (South African)");
					x = entrada.nextInt();
					
					if(x == 1){
						Escolheu = English;
					}
					else if(x == 2) {
						Escolheu = English_Canadian;
					}
					else if(x == 3) {
						Escolheu = English_South_African;
					}
				} while (x < 1 || x > 3);
			}
			do {
				System.out.println("Escolha o m�todo de ordena��o: ");
				System.out.println("1 - QuickSort\n2 - MergeSort\n3 - BubbleSort\n4 - InsertionSort\n5 - SelectionSort");
	
				ordenacao = entrada.nextInt();
				
				if (ordenacao == 1) {
					Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);
				} else if (ordenacao == 2) {
					Ordenacao.MergeSort(Escolheu, w, 0, Escolheu.length - 1);
				} else if (ordenacao == 3) {
					Ordenacao.BubbleSort(Escolheu);
				} else if (ordenacao == 4) {
					Ordenacao.InsertionSort(Escolheu);
				} else if (ordenacao == 5) {
					Ordenacao.SelectionSort(Escolheu);
				} else {
					System.out.println("\nc�digo inv�lido, tente novamente.");
				}
			} while (ordenacao > 5 || ordenacao < 1);
	
			for (String pl : Escolheu) {
				System.out.println(pl);
			}
	
			System.out.println("\nInforme a palavra a ser procurada: ");
			entrada.nextLine();
			procura = entrada.nextLine();
	
			System.out.println("\n1 - Bin�rio\n2 - Sequ�ncial");
			cod = entrada.nextInt();
	
			if (cod == 2) {
				
				if (x == 1) {
					System.out.println("\nBusca Sequencial: " + BuscaSq.buscaSequencial(Escolheu, procura, 48447));
				} else if (x == 2) {
					System.out.println("\nBusca Sequencial: " + BuscaSq.buscaSequencial(Escolheu, procura, 48618));
				} else if (x == 3) {
					System.out.println("\nBusca Sequencial: " + BuscaSq.buscaSequencial(Escolheu, procura, 53476));
				}
				
			} else if (cod == 1) {
	
				System.out.println("\nOrdem Binaria: " + BuscaBi.buscaBinaria(procura, Escolheu));
			}
	
			Saida.metodoPorScan(Escolheu);
	
			System.out.println("\nContagem nano: " + Principal.finish);
	
			System.out.println("Contagem mili: " + Principal.finish1);
			
			System.out.println("\nDeseja escolher outro dicion�rio?\n1 - Sim\n2 - N�o");
			cod = entrada.nextInt();
		}while(cod == 1);
		System.out.println("Obrigado por utilizar o programada ;D");
	}

	public static long finish = System.nanoTime(); // contador nano
	long total = finish - start;

	public static long finish1 = System.currentTimeMillis(); // contador mili
	long total1 = finish1 - start1;
}
