package br.com.estrutura;

import java.io.FileNotFoundException;

import java.io.PrintStream;

public class Saida {

	public static String[] metodoPorScan(String[] arquivo) {

		try {
			String[] arq = arquivo;
			PrintStream ps = new PrintStream("./Output/saída.txt");
			String linha = "";

			for (int i = 0; i <= arq.length; i++) {
				linha = arq[i] + " ------TAMANHO----- " + arq[i].length() + "\n";
				ps.print(linha);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return null;
	}
}