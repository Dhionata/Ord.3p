package br.com.estrutura;

import java.util.Arrays;

//beta 1.4
public class BuscaSq {

	public static long start = System.nanoTime(); // contador nano

	public static long start1 = System.currentTimeMillis(); // contador mili

	// Sequencial

	// add leitura de String

	public static int buscaSequencial() {

		String vet[] = { "arroz", "feijão", "macarrão" };

		int tamanho = 2; // Tamanho vetor

		String valor = "feijão"; // Valor a encontrar

		int i = 0;

		while ((i < tamanho) && (vet[i] != valor)) {
			i++;
		}
		if ((tamanho == 0) || (i >= tamanho))
			i = -1;

		return i;

	}

	public static long finish = System.nanoTime(); // contador nano
	long total = finish - start;

	public static long finish1 = System.currentTimeMillis(); // contador mili
	long total1 = finish1 - start1;

}