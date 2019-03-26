package br.com.estrutura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String[] English = ArquivoHandler.VetorCriar("./Linguagens/English.txt");

		String[] English_Canadian = ArquivoHandler.VetorCriar("./Linguagens/English (Canadian).txt");

		String[] English_South_African = ArquivoHandler.VetorCriar("./Linguagens/English (South African).txt");

		String[] Escolheu = {};

		int x;
		String procura;
		int ordenacao;
		int cod;
		long total, total2;

		do {
			System.out.println("-- Código feito por Dhionatã Carlos Vieira e Murillo Maciel --");
			System.out.println("\nEscolha o dicionario a ser utilizado: ");
			System.out.println("\n1 - English");
			System.out.println("\n2 - English (Canadian)");
			System.out.println("\n3 - English (South African)");

			x = extracted().nextInt();

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

					x = extracted().nextInt();

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
				System.out.println(
						"1 - QuickSort\n2 - MergeSort\n3 " + "- BubbleSort\n4 - InsertionSort\n5 - SelectionSort");

				ordenacao = extracted().nextInt();

				long start = System.nanoTime(); // contador nano inicio
				long start1 = System.currentTimeMillis(); // contador mili inicio

				if (ordenacao == 1) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);
				} else if (ordenacao == 2) {
					System.out.println("Espere até a conclusão da ordenação!");
					Ordenacao.MergeSort(Escolheu, 0, Escolheu.length - 1);
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

				long finish = System.nanoTime(); // contador nano fim
				long finish1 = System.currentTimeMillis(); // contador mili fim

				total = finish - start;
				total2 = finish1 - start1;

			} while (ordenacao > 5 || ordenacao < 1);

			for (String pl : Escolheu) {
				System.out.println(pl);
			}

			System.out.println("Deseja procurar uma palavra?\n1 - Sim \n2 - Não");
			cod = extracted().nextInt();

			while (cod == 1) {
				do {
					System.out.println("\nInforme a palavra a ser procurada: ");
					procura = extracted().nextLine();

					do {
						System.out.println("\n1 - Binário\n2 - Sequêncial");
						cod = extracted().nextInt();

						if (cod == 2) {
							System.out.println("\nBusca Sequencial: " + BuscaSq.buscaSequencial(Escolheu, procura));
						} else if (cod == 1) {
							System.out.println("\nOrdem Binaria: " + BuscaBi.buscaBinaria(procura, Escolheu));
						} else {
							System.out.println("\nCódigo inválido! tente novamente.");
						}
					} while (cod != 2 && cod != 1);
					do {
						System.out.println("Deseja procurar outra palavra? \n1 - Sim\n2 - Não");
						cod = extracted().nextInt();
						if (cod < 1 || cod > 2) {
							System.out.println("Código inválido!");
						}
					} while (cod < 1 || cod > 2);
				} while (cod == 1);
			};
			
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

			System.out.println("\nContagem Nanosegundos: " + total);

			System.out.println("Contagem em Milisegundos: " + total2);

			System.out.println("Contagem em Segundos: " + total2 / 1000);

			System.out.println("\nDeseja escolher outro dicionário?\n1 - Sim\n2 - Não");
			cod = extracted().nextInt();

		} while (cod == 1);

		System.out.println("Obrigado por utilizar o programada ;D");
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}