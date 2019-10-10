package br.com.estrutura;

import java.util.Scanner;

public class Principal {

	static int x;
	static String procura;
	static int ordenacao;
	static int cod;
	static double finish;
	static double finish2;
	static double start;
	static double start2;
	static String método;

	static String[] English = ArquivoHandler.VetorCriar("./Linguagens/English.txt");

	static String[] English_Canadian = ArquivoHandler.VetorCriar("./Linguagens/English (Canadian).txt");

	static String[] English_South_African = ArquivoHandler.VetorCriar("./Linguagens/English (South African).txt");

	public static void main(String[] args) {

		do {

			String[] Escolheu = null;

			System.out.println("-- Código feito por Dhionaté Carlos Vieira e Murillo Maciel --");
			System.out.println("\nEscolha o dicionario a ser utilizado: ");
			System.out.println("\n1 - English");
			System.out.println("\n2 - English (Canadian)");
			System.out.println("\n3 - English (South African)");

			do {

				x = extracted().nextInt();

				if (x == 1) {
					Escolheu = new String[English.length];
					Escolheu = English;
				} else if (x == 2) {
					Escolheu = new String[English_Canadian.length];
					Escolheu = English_Canadian;
				} else if (x == 3) {
					Escolheu = new String[English_South_African.length];
					Escolheu = English_South_African;
				} else {
					System.out.println("Código errado, escolha entre esses idiomas.");
				}
			} while (x < 1 || x > 3);

			do {
				System.out.println("Escolha ométodo de ordenação: ");
				System.out.println(
						"1 - QuickSort\n2 - MergeSort\n3 - BubbleSort\n4 - InsertionSort\n5 - SelectionSort\n6 - RadixSort");

				ordenacao = extracted().nextInt();

				start = System.nanoTime(); // contador nano inicio
				start2 = System.currentTimeMillis(); // contador mili inicio

				if (ordenacao == 1) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);
					método = "QuickSort";
				} else if (ordenacao == 2) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.MergeSort(Escolheu, 0, Escolheu.length - 1);
					método = "MergeSort";
				} else if (ordenacao == 3) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.BubbleSort(Escolheu);
					método = "BubbleSort";
				} else if (ordenacao == 4) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.InsertionSort(Escolheu);
					método = "InsertionSort";
				} else if (ordenacao == 5) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.SelectionSort(Escolheu);
					método = "SelectionSort";
				}

				else if (ordenacao == 6) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.radixSort(Escolheu, 'a', 'z');
				} else {
					System.out.println("\nCódigo inválido, tente novamente.");
				}

				finish = System.nanoTime(); // contador nano fim
				finish2 = System.currentTimeMillis(); // contador mili fim

			} while (ordenacao > 5 || ordenacao < 1);

			for (String pl : Escolheu) {
				System.out.println(pl);
			}

			do {
				System.out.println("\nDeseja procurar uma palavra?\n1 - Sim \n2 - Não");
				cod = extracted().nextInt();
				if (cod < 1 || cod > 2) {
					System.out.println("Código inválido!");
				}
			} while (cod < 1 || cod > 2);

			while (cod == 1) {
				do {
					System.out.println("\nInforme a palavra a ser procurada: ");
					procura = extracted().nextLine();

					do {
						System.out.println("\n1 - Binário\n2 - Sequêncial");
						cod = extracted().nextInt();

						if (cod == 2) {
							System.out.println("\nBusca Sequencial: " + Busca.buscaSequencial(Escolheu, procura));
						} else if (cod == 1) {
							System.out.println("\nOrdem Binaria: " + Busca.buscaBinaria(procura, Escolheu));
						} else {
							System.out.println("\nCódigo inválido! tente novamente.");
						}
					} while (cod != 2 && cod != 1);
					do {
						System.out.println("\nDeseja procurar outra palavra? \n1 - Sim\n2 - Não");
						cod = extracted().nextInt();
						if (cod < 1 || cod > 2) {
							System.out.println("\nCódigo inválido!");
						}
					} while (cod < 1 || cod > 2);
				} while (cod == 1);
			}

			do {
				System.out.println("\nDeseja salvar no arquivo saida.txt\n1 - Sim\n2 - Não");
				cod = extracted().nextInt();

				if (cod == 1) {
					Saida.metodoPorScan(Escolheu);
				} else if (cod == 2) {
					System.out.println("ok! kk");
				} else {
					System.out.println("Código inválido !");
				}
			} while (cod != 1 && cod != 2);

			System.out.println("Método de ordenação: " + método);

			System.out.println("\nContagem em Nanosegundos: " + (finish - start));

			System.out.println("Contagem em Milissegundos: " + (finish2 - start2));

			System.out.println("Contagem em Segundos: " + (finish - start) / 1000000000);

			do {
				System.out.println("\nDeseja escolher outro dicionário?\n1 - Sim\n2 - Não");
				cod = extracted().nextInt();
				if (cod != 1 && cod != 2) {
					System.out.println("Código inválido!");
				}
			} while (cod != 1 && cod != 2);
		} while (cod == 1);

		System.out.println("\nObrigado por utilizar o programada ;D");
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}