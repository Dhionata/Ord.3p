package br.com.estrutura;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.PrintStream;

import java.util.Scanner;

public class Saida {

	public static String[] metodoPorScan(String arquivo) {

		String arq = arquivo;
		try {

			// leitor

			Scanner sc = new Scanner(new FileReader(arq));

			// escritor

			PrintStream ps = new PrintStream("./Output/saída.txt");

			// percorre o arquivo

			while (sc.hasNextLine()) {

				String linha = sc.nextLine();

				// Comprimento da String

				int imprimir = linha.length();

				int length = imprimir;

				// grava no destino

				ps.print(linha);
				ps.println("----------------------------" + length);

				System.out.println();

			}

			// fecha tudo

			ps.close();

			sc.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
		return null;
	}

	public static void main(String[] args) {

		// gravando

		// metodoPorStream();

		metodoPorScan(null);

	}
}