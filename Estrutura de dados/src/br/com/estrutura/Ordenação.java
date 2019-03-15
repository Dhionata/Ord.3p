package br.com.estrutura;

// beta 
public class Ordenação {

	// SelectionSort

	public static void SelectionSort(String[] dicionario) {

		for (int i = 0; i < (dicionario.length); i++) {
			int min = i;
			for (int j = i + 1; j < dicionario.length; j++) {
				if (dicionario[j].compareToIgnoreCase(dicionario[min]) < 0) {
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

		for (int i = 0; i < dicionario.length; i++) {
			for (int j = 0; j < (dicionario.length - 1); j++) {
				if (dicionario[j].compareToIgnoreCase(dicionario[j + 1]) == -1) {
					String aux;
					aux = dicionario[j];
					dicionario[j] = dicionario[j + 1];
					dicionario[j + 1] = aux;
				}
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

			while ((j >= 0) && (aux.compareToIgnoreCase(palavras[j]) == -1)) {
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
			if (p[i].compareToIgnoreCase(pivo) <= 0)
				i++;

			else if (p[j].compareToIgnoreCase(pivo) > 0)
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
}