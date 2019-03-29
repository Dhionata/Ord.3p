package br.com.estrutura;

import java.io.FileNotFoundException;

import java.io.PrintStream;

public class Saida {

	private static PrintStream ps;

	public static void metodoPorScan(String[] arquivo) {

		try {
			ps = new PrintStream("./Output/saida.txt");
			String linha = "";

			for (int i = 0; i < arquivo.length; i++) {
				linha = arquivo[i] + "     ----" + arquivo[i].length() + "\n";
				ps.print(linha);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}