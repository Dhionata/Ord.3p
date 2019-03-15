package br.com.estrutura;

import java.util.*;

public class Ordenação {

	public static void main(String[] args) {

		// 1.0 beta kk

		String[] palavras = { "goiaba", "melancia", "ovo", "pinga", "Dhionatã" };

		Arrays.sort(palavras);
		for (String pl : palavras) {
			System.out.println(pl);
		}
		for (int i = 0; i < palavras.length; i++) {
			for (int j = 0; j < (palavras.length - 1); j++) {
				if (palavras[j].length() > palavras[j + 1].length()) {
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
}