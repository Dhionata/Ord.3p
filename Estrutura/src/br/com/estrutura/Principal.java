package br.com.estrutura;

import java.util.Scanner;

public class Principal {

	static int x, ordenacao, cod;
	static String procura, metodo;
	static double finish, finish2, start, start2;
	static String[] Escolheu;

	public static void main(String[] args) {

		System.out.println("-- Código feito por Dhionatã Carlos Vieira e Murillo Maciel --");
		do {

			System.out.println("\nEscolha o dicionario a ser utilizado: ");
			System.out.println("\n1 - English");
			System.out.println("\n2 - English (Canadian)");
			System.out.println("\n3 - English (South African)");

			do {
				x = extracted().nextInt();

				if (x == 1) {
					Escolheu = ArquivoHandler.VetorCriar("./Linguagens/English.txt");
				} else if (x == 2) {
					Escolheu = ArquivoHandler.VetorCriar("./Linguagens/English (Canadian).txt");
				} else if (x == 3) {
					Escolheu = ArquivoHandler.VetorCriar("./Linguagens/English (South African).txt");
				} else {
					System.out.println("codigo errado, escolha entre esses idiomas.");
				}
			} while (x < 1 || x > 3);

			do {
				System.out.println("Escolha o metodo de ordenacao: ");
				System.out.println(
						"1 - QuickSort\n2 - MergeSort\n3 - BubbleSort\n4 - InsertionSort\n5 - SelectionSort\n6 - RadixSort");

				ordenacao = extracted().nextInt();

				start = System.nanoTime(); // contador nano inicio
				start2 = System.currentTimeMillis(); // contador mili inicio

				if (ordenacao == 1) {
					System.out.println("Espere até a conclusao da ordenacao!");
					Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);
					metodo = "QuickSort";
				} else if (ordenacao == 2) {
					System.out.println("Espere até a conclusão da ordenacao!");
					Ordenacao.MergeSort(Escolheu, 0, Escolheu.length - 1);
					metodo = "MergeSort";
				} else if (ordenacao == 3) {
					System.out.println("Espere até a conclusão da ordenacao!");
					Ordenacao.BubbleSort(Escolheu);
					metodo = "BubbleSort";
				} else if (ordenacao == 4) {
					System.out.println("Espere até a conclusão da ordenacao!");
					Ordenacao.InsertionSort(Escolheu);
					metodo = "InsertionSort";
				} else if (ordenacao == 5) {
					System.out.println("Espere até a conclusão da ordenacao!");
					Ordenacao.SelectionSort(Escolheu);
					metodo = "SelectionSort";
				}

				else if (ordenacao == 6) {
					System.out.println("Espere até a conclusão da ordenacao!");
					Ordenacao.radixSort(Escolheu, 'a', 'z');
				} else {
					System.out.println("\ncodigo invalido, tente novamente.");
				}

				finish = System.nanoTime(); // contador nano fim
				finish2 = System.currentTimeMillis(); // contador mili fim

				tempo();

			} while (ordenacao > 5 || ordenacao < 1);

			do {
				System.out.println("\nDeseja procurar uma palavra?\n1 - Sim \n2 - Não");
				cod = extracted().nextInt();
				if (cod < 1 || cod > 2) {
					System.out.println("codigo invalido!");
				}
			} while (cod < 1 || cod > 2);

			while (cod == 1) {
				do {
					System.out.println("\nInforme a palavra a ser procurada: ");
					procura = extracted().nextLine();

					do {
						System.out.println("\n1 - Binário\n2 - Sequencial");
						cod = extracted().nextInt();

						if (cod == 2) {
							System.out.println("\nBusca Sequencial: " + Busca.buscaSequencial(Escolheu, procura));
						} else if (cod == 1) {
							System.out.println("\nOrdem Binaria: " + Busca.buscaBinaria(procura, Escolheu));
						} else {
							System.out.println("\ncodigo invalido! tente novamente.");
						}
					} while (cod != 2 && cod != 1);
					do {
						System.out.println("\nDeseja procurar outra palavra? \n1 - Sim\n2 - Não");
						cod = extracted().nextInt();
						if (cod < 1 || cod > 2) {
							System.out.println("\ncodigo invalido!");
						}
					} while (cod < 1 || cod > 2);
				} while (cod == 1);
			}

			Saida.metodoPorScan(Escolheu);
			System.out.println("\nDicionario ordenado salvo em Output/saida.txt");

			do {
				System.out.println("\nDeseja escolher outro dicionario?\n1 - Sim\n2 - Não");
				cod = extracted().nextInt();
				if (cod != 1 && cod != 2) {
					System.out.println("codigo invalido!");
				}
			} while (cod != 1 && cod != 2);
		} while (cod == 1);

		System.out.println("\nObrigado por utilizar o programada ;D");
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	public static void tempo() {
		System.out.println("metodo de ordenacao: " + metodo);

		System.out.println("\nContagem em Nanosegundos: " + (finish - start));

		System.out.println("Contagem em Milissegundos: " + (finish2 - start2));

		System.out.println("Contagem em Segundos: " + (finish - start) / 1000000000);
	}
}