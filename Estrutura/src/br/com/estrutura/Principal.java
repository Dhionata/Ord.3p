package br.com.estrutura;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static double start = System.nanoTime(); // contador nano
	public static double start1 = System.currentTimeMillis(); // contador mili

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

			if (x == 1) {
				Escolheu = English;
			} else if (x == 2) {
				Escolheu = English_Canadian;
			} else if (x == 3) {
				Escolheu = English_South_African;
			}

			if (x < 1 || x > 3) {
				do {
					System.out.println("Código errado, escolha entre esses idiomas.");
					System.out.println("\n1 - English");
					System.out.println("\n2 - English (Canadian)");
					System.out.println("\n3 - English (South African)");
					x = entrada.nextInt();

					if (x == 1) {
						Escolheu = English;
					} else if (x == 2) {
						Escolheu = English_Canadian;
					} else if (x == 3) {
						Escolheu = English_South_African;
					}
				} while (x < 1 || x > 3);
			}
			do {
				System.out.println("Escolha o método de ordenação: ");
				System.out
						.println("1 - QuickSort\n2 - MergeSort\n3 - BubbleSort\n4 - InsertionSort\n5 - SelectionSort");

				ordenacao = entrada.nextInt();

				if (ordenacao == 1) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);
				} else if (ordenacao == 2) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.MergeSort(Escolheu, w, 0, Escolheu.length - 1);
				} else if (ordenacao == 3) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.BubbleSort(Escolheu);
				} else if (ordenacao == 4) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.InsertionSort(Escolheu);
				} else if (ordenacao == 5) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.SelectionSort(Escolheu);
				} else {
					System.out.println("\ncódigo inválido, tente novamente.");
				}
			} while (ordenacao > 5 || ordenacao < 1);

			for (String pl : Escolheu) {
				System.out.println(pl);
			}

			System.out.println("\nInforme a palavra a ser procurada: ");
			entrada.nextLine();
			procura = entrada.nextLine();

			System.out.println("\n1 - Binário\n2 - Sequêncial");
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

			do {
				System.out.println("\nDeseja salvar no arquivo saida.txt\n1 - Sim\n2 - Não");
				cod = entrada.nextInt();

				if (cod == 1) {
					Saida.metodoPorScan(Escolheu);
				} else if (cod == 2) {
					System.out.println("ok! kk");
				} else {
					System.out.println("Código inválido !");
				}
			} while (cod != 1 && cod != 2);

			System.out.println("\nContagem nano: " + Principal.total);

			System.out.println("Contagem mili: " + Principal.total1);

			System.out.println("\nDeseja escolher outro dicionário?\n1 - Sim\n2 - Não");
			cod = entrada.nextInt();

		} while (cod == 1);

		System.out.println("Obrigado por utilizar o programada ;D");
	}

	public static double finish = System.nanoTime(); // contador nano
	static double total = finish - start;

	public static double finish1 = System.currentTimeMillis(); // contador mili
	static double total1 = finish1 - start1;
}