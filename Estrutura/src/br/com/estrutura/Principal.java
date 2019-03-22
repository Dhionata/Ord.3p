package br.com.estrutura;

import java.util.Scanner;

public class Principal {

	public static long start = System.nanoTime(); // contador nano
	public static long start1 = System.currentTimeMillis(); // contador mili

	public static void main(String[] args) {

		String[] English = ArquivoHandler.VetorCriar("./Linguagens/English.txt");

		String[] Portugues = ArquivoHandler.VetorCriar("./Linguagens/Portugues.txt");

		String[] Latim = ArquivoHandler.VetorCriar("./Linguagens/Latim.txt");

		String[] Escolheu = {};

		// sa�da

		String[] Arqui = {};

		Scanner entrada = new Scanner(System.in);

		int x;

		do {

			System.out.println("\nEscolha o dicionario a ser utilizado: ");
			System.out.println("\n1 - English");
			System.out.println("\n2 - Portugues");
			System.out.println("\n3 - Latim");

			x = entrada.nextInt();

			if (x == 1) {
				Escolheu = English;
			} else if (x == 2) {
				Escolheu = Portugues;
			} else if (x == 3) {
				Escolheu = Latim;
			} else {
				System.out.println("\n\nCodigo Invalido, tente novamente.");
			}
		} while (x < 1 || x > 3);

		String[] w = new String[Escolheu.length];

		// Arrays.sort(English);//ordenando alfabeticamente.

		Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);

		if (Escolheu == English) {

			String valor;

			System.out.println("Escolha a palavra: ");

			entrada.nextLine();

			valor = entrada.nextLine();

			System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial(Escolheu, valor, 48447));

		}

		else if (Escolheu == Portugues) {

			String valor;

			System.out.println("Escolha a palavra: ");

			entrada.nextLine();

			valor = entrada.nextLine();

			System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial(Escolheu, valor, 307374));

		}

		else if (Escolheu == Latim) {

			String valor;

			System.out.println("Escolha a palavra: ");

			entrada.nextLine();

			valor = entrada.nextLine();

			System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial(Escolheu, valor, 129290));

		}

		// Ordenacao.MergeSort(Escolheu, w, 0, Escolheu.length - 1);

		// Ordenacao.BubbleSort(Escolheu);

		// Ordenacao.InsertionSort(Escolheu);

		// Ordenacao.SelectionSort(Escolheu);

		// String [] Arqui = Saida.metodoPorScan("./Linguagens/English.txt");

		for (String pl : Escolheu) {
			System.out.println(pl);
		}

		System.out.println("Informe a palavra a ser procurada: ");

		String aserachada;

		aserachada = entrada.nextLine();

		System.out.println("Ordem Binaria: " + BuscaBi.buscaBinaria(aserachada, Escolheu));

		System.out.println("Contagem nano: " + Principal.finish);

		System.out.println("Contagem mili: " + Principal.finish1);

		Arqui = Saida.metodoPorScan("./Linguagens/English.txt"); // (formata��o de String[] em String)
	}

	public static long finish = System.nanoTime(); // contador nano
	long total = finish - start;

	public static long finish1 = System.currentTimeMillis(); // contador mili
	long total1 = finish1 - start1;
}
