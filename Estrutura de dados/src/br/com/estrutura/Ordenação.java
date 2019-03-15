package br.com.estrutura;

import java.util.*;

public class Ordenação extends Busca {

	//BubbleSort
	
	public void BubbleSort(String[] dicionario) {
		// beta kk

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

	// InsertionSort
	
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

	// QuickSort
	
	public void QuickSort(String[] dicionario, int esquerdo, int direito) {
		
		String[] palavras = dicionario;
		Arrays.sort(palavras);
		
		if (esquerdo < direito) {
			int j = separar(palavras, esquerdo, direito);
			QuickSort(palavras, esquerdo, j - 1);
			QuickSort(palavras, j + 1, direito);
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