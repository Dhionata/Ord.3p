package br.com.estrutura;

import java.util.*;

public class Ordenação extends Busca {

	public void BubbleSort() {
		// 1.1 beta kk

		String[] palavras = { Busca.Ler() };

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

	public void InsertionSort() {

		String[] palavras = { Busca.Ler() };
		Arrays.sort(palavras);

		for (String pl : palavras) {
			System.out.println(pl);
		}
		
		int i, j;
		String aux;
		
		for(i = 1;i <palavras.length;i++) {
			aux = palavras[i];
			j = i - 1;
			
			while((j >= 0) && (aux.compareToIgnoreCase(palavras[j]) == -1)) {
				palavras[j+1] = palavras[j];
				j--;
			}
			palavras[j+1] = aux;
		}
		for (String pl : palavras) {
			System.out.println(pl);
		}
	}
}