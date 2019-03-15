package br.com.estrutura;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

public class Busca {

	// Sequencial

	public static long start = System.nanoTime(); // contador nano

	public static long start1 = System.currentTimeMillis(); // contador mili

	public static String Ler() {

		Path caminho = Paths.get("C:\\Users\\muril\\Desktop\\Diciona\\dici.txt");

		try {
			byte[] texto = Files.readAllBytes(caminho);

			String leitura = new String(texto);

			return leitura;

		} catch (Exception erro) {

		}
		return null;
	}

	public static int buscaSequencial() {

		int vet[] = { 5, 7, 8, 1, 4, 6, 11, 34 };

		int tl = 7; // Tamanho vetori

		int valor = 8; // Valor a encontrar

		int i = 0;

		while ((i < tl) && (vet[i] != valor)) {
			i++;
		}
		if ((tl == 0) || (i >= tl))
			i = -1;

		return i;
	}
	// Binaria

	public static boolean Binaria() {

		int x = 78;

		int dados[] = { 2, 4, 78, 65, 32, 21, 45, 6 };
		int n = dados.length;
		int aux = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (dados[i] > dados[j]) {
					aux = dados[j];
					dados[j] = dados[i];
					dados[i] = aux;
				}
			}
		}
		int meio;
		int inicio = 0;
		int fim = dados.length - 1;
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (x == dados[meio])
				return true;
			if (x < dados[meio])
				fim = meio - 1;
			else
				inicio = meio + 1;
		}
		return false;
	}

	public static long finish = System.nanoTime(); // contador nano
	long total = finish - start;

	public static long finish1 = System.currentTimeMillis(); // contador mili
	long total1 = finish1 - start1;
}