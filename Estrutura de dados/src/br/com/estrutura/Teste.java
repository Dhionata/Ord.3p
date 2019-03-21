package br.com.estrutura;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		String[] English = ArquivoHandler.VetorCriar("./Linguagem/English.txt");
		String[] Portugues = ArquivoHandler.VetorCriar("./Linguagem/Portugues.txt");
		String[] Latim = ArquivoHandler.VetorCriar("./Linguagem/Latim.txt");
		String[] Escolheu = {};

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
				System.out.println("\n\nCódigo inválido, tente novamente.");
			}
		} while (x < 1 || x > 3);

		String[] w = new String[Escolheu.length];

		// Arrays.sort(English);//ordenando alfabeticamente.

		// System.out.println("Tempo nanosegundos: " + b1.total);

		// System.out.println("Tempo milissegundos: " + b1.total1);

		// System.out.println("Teste: " + b1.VetorCriar());

		// System.out.println("Ordem de leitura: " + Busca.Ler());

		// System.out.println("Tempo nanosegundos: ");

		Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);
		Ordenacao.MergeSort(Escolheu, w, 0, Escolheu.length - 1);
		Ordenacao.BubbleSort(Escolheu);
		Ordenacao.InsertionSort(Escolheu);
		Ordenacao.SelectionSort(Escolheu);

		for (String pl : Escolheu) {
			System.out.println(pl);
		}

		// System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial());

		// System.out.println("Ordem Binaria: ");
		// BuscaBi.BuscaBinaria();

		// System.out.println("Contagem nano: " + BuscaSq.finish);
		// System.out.println("Contagem mili: " + BuscaSq.finish1);
	}
}