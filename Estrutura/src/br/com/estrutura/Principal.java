package br.com.estrutura;

import java.util.Scanner;

public class Principal {

	public static long start = System.nanoTime(); // contador nano
	public static long start1 = System.currentTimeMillis(); // contador mili

	public static void main(String[] args) {

		String[] English = ArquivoHandler.VetorCriar("./Linguagens/English.txt");

		String[] Portugues = ArquivoHandler.VetorCriar("./Linguagens/English (Canadian).txt");

		String[] Latim = ArquivoHandler.VetorCriar("./Linguagens/English (South African).txt");

		String[] Escolheu = {};

		String[] w = new String[Escolheu.length];

		// saída

		String[] Arqui = {};

		Scanner entrada = new Scanner(System.in);

		int x;
		String procura;
		int ordenacao;

		System.out.println("\nEscolha o dicionario a ser utilizado: ");
		System.out.println("\n1 - English");
		System.out.println("\n2 - Portugues");
		System.out.println("\n3 - Latim");

		x = entrada.nextInt();
		
		if(x == 1){
			Escolheu = English;
		}
		else if(x == 2) {
			Escolheu = Portugues;
		}
		else if(x == 3) {
			Escolheu = Latim;
		}
		
		if (x < 1 || x > 3) {
			do {
				System.out.println("Código errado, escolha entre esses idiomas.");
				System.out.println("\n1 - English");
				System.out.println("\n2 - Portugues");
				System.out.println("\n3 - Latim");
				x = entrada.nextInt();
				
				if(x == 1){
					Escolheu = English;
				}
				else if(x == 2) {
					Escolheu = Portugues;
				}
				else if(x == 3) {
					Escolheu = Latim;
				}
			} while (x < 1 || x > 3);
		}
		do {
			System.out.println("Escolha o método de ordenação: ");
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
				System.out.println("código inválido, tente novamente.");
			}
		} while (ordenacao > 5 || ordenacao < 1);

		for (String pl : Escolheu) {
			System.out.println(pl);
		}

		System.out.println("Informe a palavra a ser procurada: ");
		entrada.nextLine();
		procura = entrada.nextLine();

		System.out.println("1 - Binário\n2 - Sequêncial");
		int cod = entrada.nextInt();

		if (cod == 2) {
			
			if (x == 1) {
				System.out.println("Busca Sequencial: " + BuscaSq.buscaSequencial(Escolheu, procura, 48447));
			} else if (x == 2) {
				System.out.println("Busca Sequencial: " + BuscaSq.buscaSequencial(Escolheu, procura, 307374));
			} else if (x == 3) {
				System.out.println("Busca Sequencial: " + BuscaSq.buscaSequencial(Escolheu, procura, 129290));
			}
			
		} else if (cod == 1) {

			System.out.println("Ordem Binaria: " + BuscaBi.buscaBinaria(procura, Escolheu));
		}
		// Arrays.sort(English);//ordenando alfabeticamente.

		/*
		 * if (Escolheu == English) {
		 * 
		 * System.out.println("Escolha a palavra: ");
		 * 
		 * entrada.nextLine();
		 * 
		 * valor = entrada.nextLine();
		 * 
		 * System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial(Escolheu,
		 * valor, 48447));
		 * 
		 * }
		 * 
		 * else if (Escolheu == Portugues) {
		 * 
		 * System.out.println("Escolha a palavra: ");
		 * 
		 * entrada.nextLine();
		 * 
		 * valor = entrada.nextLine();
		 * 
		 * System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial(Escolheu,
		 * valor, 307374));
		 * 
		 * }
		 * 
		 * else if (Escolheu == Latim) {
		 * 
		 * System.out.println("Escolha a palavra: ");
		 * 
		 * entrada.nextLine();
		 * 
		 * valor = entrada.nextLine();
		 * 
		 * System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial(Escolheu,
		 * valor, 129290));
		 * 
		 * }
		 */

		// String [] Arqui = Saida.metodoPorScan("./Linguagens/English.txt");

		//Arqui = Saida.metodoPorScan(Escolheu); // (formatação de String[] em String)

		System.out.println("Contagem nano: " + Principal.finish);

		System.out.println("Contagem mili: " + Principal.finish1);

	}

	public static long finish = System.nanoTime(); // contador nano
	long total = finish - start;

	public static long finish1 = System.currentTimeMillis(); // contador mili
	long total1 = finish1 - start1;
}
