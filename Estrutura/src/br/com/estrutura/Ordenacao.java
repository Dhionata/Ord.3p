package br.com.estrutura;

import java.util.Arrays;

public class Ordenacao {

	// SelectionSort

	public static void SelectionSort(String[] dicionario) {

		for (int i = 0; i < (dicionario.length); i++) {
			int min = i;
			for (int j = i + 1; j < dicionario.length; j++) {
				if (dicionario[j].length() < dicionario[min].length()) {
					min = j;
				}
				String aux = dicionario[i];
				dicionario[i] = dicionario[min];
				dicionario[min] = aux;
			}
		}
	}

	// BubbleSort

	public static void BubbleSort(String[] dicionario) {
		String aux;
		boolean controle;

		for (int i = 0; i < dicionario.length; i++) {
			controle = true;
			for (int j = 0; j < (dicionario.length - 1); j++) {
				if (dicionario[j].length() > dicionario[j + 1].length()) {
					aux = dicionario[j];
					dicionario[j] = dicionario[j + 1];
					dicionario[j + 1] = aux;
					controle = false;
				}
			}
			if (controle == true) {
				break;
			}
		}
	}

	// InsertionSort

	public static void InsertionSort(String[] dicionario) {

		String[] palavras = dicionario;

		int i, j;
		String aux;

		for (i = 1; i < palavras.length; i++) {
			aux = palavras[i];
			j = i - 1;

			while ((j >= 0) && (aux.length() < palavras[j].length())) {
				palavras[j + 1] = palavras[j];
				j--;
			}
			palavras[j + 1] = aux;
		}
	}

	// QuickSort

	public static void QuickSort(String[] dicionario, int esquerdo, int direito) {

		if (esquerdo < direito) {
			int j = separar(dicionario, esquerdo, direito);
			QuickSort(dicionario, esquerdo, j - 1);
			QuickSort(dicionario, j + 1, direito);
		}
	}

	private static int separar(String[] p, int esquerdo, int direito) {

		int i = esquerdo + 1;
		int j = direito;

		String pivo = p[esquerdo];

		while (i <= j) {
			if (p[i].length() <= pivo.length())
				i++;

			else if (p[j].length() > pivo.length())
				j--;

			else if (i <= j) {
				trocar(p, i, j);
				i++;
				j--;
			}
		}
		trocar(p, esquerdo, j);
		return j;
	}

	private static void trocar(String[] pav, int i, int j) {
		String aux = pav[i];
		pav[i] = pav[j];
		pav[j] = aux;
	}

	// MergeSort

	public static void MergeSort(String[] dicionario, int inicio, int tamanho) {
		int meio = (inicio + tamanho) / 2;
		if (inicio < tamanho) {
			MergeSort(dicionario, inicio, meio);
			MergeSort(dicionario, meio + 1, tamanho);
			intercalar(dicionario, inicio, meio, tamanho);
		}
	}

	private static void intercalar(String[] dicionario, int inicio, int meio, int tamanho) {
		int metadinha = meio + 1;

		while ((inicio <= meio) && (metadinha <= tamanho)) {
			if (dicionario[inicio].length() < dicionario[metadinha].length()) {
				inicio++;
			} else {
				String aux = dicionario[metadinha];
				for (int j = metadinha - 1; j >= inicio; j--) {
					dicionario[j + 1] = dicionario[j];
				}
				dicionario[inicio] = aux;
				inicio++;
				meio++;
				metadinha++;
			}
		}
	}
	// RadixSort

	public static void countingSort(String[] arr, int index, char lower, char upper) {
		int[] countArray = new int[(upper - lower) + 2];
		String[] tempArray = new String[arr.length];
		Arrays.fill(countArray, 0);

		// increase count for char at index
		for (int i = 0; i < arr.length; i++) {
			int charIndex = (arr[i].length() - 1 < index) ? 0 : ((arr[i].charAt(index) - lower) + 1);
			countArray[charIndex]++;
		}

		// sum up countArray;countArray will hold last index for the char at each
		// strings index
		for (int i = 1; i < countArray.length; i++) {
			countArray[i] += countArray[i - 1];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			int charIndex = (arr[i].length() - 1 < index) ? 0 : (arr[i].charAt(index) - lower) + 1;
			tempArray[countArray[charIndex] - 1] = arr[i];
			countArray[charIndex]--;
		}

		for (int i = 0; i < tempArray.length; i++) {
			arr[i] = tempArray[i];
		}
	}

	public static void radixSort(String[] arr, char lower, char upper) {
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() - 1 > maxIndex) {
				maxIndex = arr[i].length() - 1;
			}
		}

		for (int i = maxIndex; i >= 0; i--) {
			countingSort(arr, i, lower, upper);
		}
	}
}