package br.com.estrutura;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.RandomAccessFile;

import java.io.FileReader;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.Arrays;

//beta 1.4
public class Busca {

	public static long start = System.nanoTime(); // contador nano

	public static long start1 = System.currentTimeMillis(); // contador mili

	// 51541

	public static String VetorCriar(String cam) {

		String caminho = cam;

		try {

			FileReader arquivo = new FileReader(caminho);

			BufferedReader leitorLinhas = new BufferedReader(arquivo);

			String linha = "";

			linha = leitorLinhas.readLine();

			int tamanhoVetor = Integer.parseInt(linha);

			String[] vetorTxt = new String[tamanhoVetor + 1];

			int i = 0;

			while (linha != null) {

				vetorTxt[i] = linha;

				linha = leitorLinhas.readLine();

				i++;

			}

			arquivo.close();
			
			for(String pl: vetorTxt) {
				System.out.println(pl);
			}

		} catch (IOException erro) {

			System.out.println("Erro ao ler arquivo: " + erro.getMessage());

		}
		return null;

	}
	//

	// Metodo para depois que a String entrar no vetor

	// Sequencial \\

	public static int buscaSequencial() {

		int vet[] = { 5, 7, 8, 1, 4, 6, 11, 34 };

		int tl = 7; // Tamanho vetor

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