package br.com.estrutura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int x;
		String procura;
		int ordenacao;
		int cod;
		double finish, finish2, start, start2;

		String[] English = ArquivoHandler.VetorCriar("./Linguagens/English.txt");

		String[] English_Canadian = ArquivoHandler.VetorCriar("./Linguagens/English (Canadian).txt");

		String[] English_South_African = ArquivoHandler.VetorCriar("./Linguagens/English (South African).txt");

		do {

			String[] Escolheu = {};

			System.out.println("-- C�digo feito por Dhionat� Carlos Vieira e Murillo Maciel --");
			System.out.println("\nEscolha o dicionario a ser utilizado: ");
			System.out.println("\n1 - English");
			System.out.println("\n2 - English (Canadian)");
			System.out.println("\n3 - English (South African)");

			do {
				x = extracted().nextInt();

				if (x == 1) {
					Escolheu = English;
				} else if (x == 2) {
					Escolheu = English_Canadian;
				} else if (x == 3) {
					Escolheu = English_South_African;
				} else {
					System.out.println("C�digo errado, escolha entre esses idiomas.");
				}
			} while (x < 1 || x > 3);

			do {
				System.out.println("Escolha o m�todo de ordena��o: ");
				System.out.println(
						"1 - QuickSort\n2 - MergeSort\n3 - BubbleSort\n4 - InsertionSort\n5 - SelectionSort\n6 - RadixSort");

				ordenacao = extracted().nextInt();

				start = System.nanoTime(); // contador nano inicio
				start2 = System.currentTimeMillis(); // contador mili inicio

				if (ordenacao == 1) {
					System.out.println("Espere at� a conclus�o da ordena��o!");
					Ordenacao.QuickSort(Escolheu, 0, Escolheu.length - 1);
				} else if (ordenacao == 2) {
					System.out.println("Espere at� a conclus�o da ordena��o!");
					Ordenacao.MergeSort(Escolheu, 0, Escolheu.length - 1);
				} else if (ordenacao == 3) {
					System.out.println("Espere at� a conclus�o da ordena��o!");
					Ordenacao.BubbleSort(Escolheu);
				} else if (ordenacao == 4) {
					System.out.println("Espere at� a conclus�o da ordena��o!");
					Ordenacao.InsertionSort(Escolheu);
				} else if (ordenacao == 5) {
					System.out.println("Espere at� a conclus�o da ordena��o!");
					Ordenacao.SelectionSort(Escolheu);
				}

				else if (ordenacao == 6) {
					System.out.println("Espere at� a conclus�o daordena��o!");
					Ordenacao.radixSort(Escolheu, 'a', 'z');
				} else {
					System.out.println("\nc�digo inv�lido, tente novamente.");
				}

				finish = System.nanoTime(); // contador nano fim
				finish2 = System.currentTimeMillis(); // contador mili fim

			} while (ordenacao > 5 || ordenacao < 1);

			for (String pl : Escolheu) {
				System.out.println(pl);
			}

			do {
				System.out.println("\nDeseja procurar uma palavra?\n1 - Sim \n2 - N�o");
				cod = extracted().nextInt();
				if (cod < 1 || cod > 2) {
					System.out.println("C�digo inv�lido!");
				}
			} while (cod < 1 || cod > 2);

			while (cod == 1) {
				do {
					System.out.println("\nInforme a palavra a ser procurada: ");
					procura = extracted().nextLine();

					do {
						System.out.println("\n1 - Bin�rio\n2 - Sequ�ncial");
						cod = extracted().nextInt();

						if (cod == 2) {
							System.out.println("\nBusca Sequencial: " + Busca.buscaSequencial(Escolheu, procura));
						} else if (cod == 1) {
							System.out.println("\nOrdem Binaria: " + Busca.buscaBinaria(procura, Escolheu));
						} else {
							System.out.println("\nC�digo inv�lido! tente novamente.");
						}
					} while (cod != 2 && cod != 1);
					do {
						System.out.println("\nDeseja procurar outra palavra? \n1 - Sim\n2 - N�o");
						cod = extracted().nextInt();
						if (cod < 1 || cod > 2) {
							System.out.println("\nC�digo inv�lido!");
						}
					} while (cod < 1 || cod > 2);
				} while (cod == 1);
			}

			do {
				System.out.println("\nDeseja salvar no arquivo saida.txt\n1 - Sim\n2 - N�o");
				cod = extracted().nextInt();

				if (cod == 1) {
					Saida.metodoPorScan(Escolheu);
				} else if (cod == 2) {
					System.out.println("ok! kk");
				} else {
					System.out.println("C�digo inv�lido !");
				}
			} while (cod != 1 && cod != 2);

			System.out.println("\nContagem em Nanosegundos: " + (finish - start));

			System.out.println("Contagem em Milissegundos: " + (finish2 - start2));

			System.out.println("Contagem em Segundos: " + (finish - start) / 1000000000);

			do {
				System.out.println("\nDeseja escolher outro dicion�rio?\n1 - Sim\n2 - N�o");
				cod = extracted().nextInt();
				if (cod != 1 && cod != 2) {
					System.out.println("C�digo inv�lido!");
				}
			} while (cod != 1 && cod != 2);
		} while (cod == 1);

		System.out.println("\nObrigado por utilizar o programada ;D");
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}