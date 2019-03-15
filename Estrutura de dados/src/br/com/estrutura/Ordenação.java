package br.com.estrutura;

import java.util.*;

public class Ordenação extends Busca {

	public void BubbleSort(String[] dicionario) {
		// 1.1 beta kk

		String[] palavras = dicionario;

		Arrays.sort(palavras);
		for (String pl : palavras) {
			System.out.println(pl);
		}
		for (int i = 0; i < palavras.length; i++) {
			for (int j = 0; j < (palavras.length - 1); j++) {
				if (palavras[j].compareToIgnoreCase(palavras[j + 1]) == -1) {
					String aux;
					aux = palavras[j];
					palavras[j] = palavras[j + 1];
					palavras[j + 1] = aux;
				}
			}
		}
		for (String pl : palavras) {
			System.out.println(pl);
		}
	}

	public void InsertionSort(String[] dicionario) {

		String[] palavras = dicionario;
		Arrays.sort(palavras);

		for (String pl : palavras) {
			System.out.println(pl);
		}

		int i, j;
		String aux;

		for (i = 1; i < palavras.length; i++) {
			aux = palavras[i];
			j = i - 1;

			while ((j >= 0) && (aux.compareToIgnoreCase(palavras[j]) == -1)) {
				palavras[j + 1] = palavras[j];
				j--;
			}
			palavras[j + 1] = aux;
		}
		for (String pl : palavras) {
			System.out.println(pl);
		}
	}

	public void QuickSort(String[] p, int esquerdo, int direito) {
		if (esquerdo < direito) {
			int j = separar(p, esquerdo, direito);
			QuickSort(p, esquerdo, j - 1);
			QuickSort(p, j + 1, direito);
		}
	}

	private int separar(String[] p, int esquerdo, int direito) {
		int i = esquerdo + 1;
		int j = direito + 1;
		String pivo = p[esquerdo];

		while (i <= j) {
			if (p[i].compareToIgnoreCase(pivo) <= 0) {
				i++;
			} else if (p[j].compareToIgnoreCase(pivo) > 0) {
				j--;
			} else if (i <= j) {
				trocar(p, i, j);
				i++;
				j--;
			}
		}
		trocar(p, esquerdo, j);
		return j;
	}

	private void trocar(String[] p, int i, int j) {
		String aux = p[i];
		p[i] = p[j];
		p[j] = aux;

	}
}