package br.com.estrutura;

import java.util.Arrays;

//beta 1.4
public class Teste {

	public static void main(String[] args) {

		String[] blabla = ArquivoHandler.VetorCriar("./Linguagem/dic.txt");

		// Arrays.sort(blabla);//ordenando alfabeticamente.

		

		// System.out.println("Tempo nanosegundos: " + b1.total);

		// System.out.println("Tempo milissegundos: " + b1.total1);

		// System.out.println("Teste: " + b1.VetorCriar());

		// System.out.println("Ordem de leitura: " + Busca.Ler());

		// System.out.println("Tempo nanosegundos: ");

		Ordenação.QuickSort(blabla, 0, blabla.length - 1);
		//Ordenação.BubbleSort(blabla);
		//Ordenação.InsertionSort(blabla);
		//Ordenação.SelectionSort(blabla);

		for (String pl : blabla) {
			System.out.println(pl);
		}
		
		System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial());
		
		
		System.out.println("Ordem Binaria: ");
		BuscaBi.BuscaBinaria();
		
		
		System.out.println("Contagem nano: " + BuscaSq.finish);
		System.out.println("Contagem mili: "+ BuscaSq.finish1);
	}

	}
