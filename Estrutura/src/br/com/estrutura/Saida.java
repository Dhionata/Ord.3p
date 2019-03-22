package br.com.estrutura;

import java.io.FileNotFoundException;

import java.io.PrintStream;

public class Saida {

	public static void metodoPorScan(String[] arquivo) {

		try {
			String[] arq = arquivo;
			PrintStream ps = new PrintStream("./Output/saída.txt");
			String linha = "";
			ps.print("Palavra           ----TAMANHO\n");

			for (int i = 0; i < arq.length; i++) {
				linha = arq[i] + "     ----" + arq[i].length() + "\n";
				ps.print(linha);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}