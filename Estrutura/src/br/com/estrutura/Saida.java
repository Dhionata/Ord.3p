package br.com.estrutura;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import java.util.Scanner;

public class Saida {

	public static BufferedWriter metodoPorScan(String[] arquivo, String nomedoindereco) throws IOException {
		
	
		String[] arq = arquivo;
		BufferedWriter imprimir = new BufferedWriter(new FileWriter(nomedoindereco));
		String linha = "";
		
		for(int i = 0; i<= arq.length; i++) {
			linha = arq[i] + " ------TAMANHO----- " + arq[i].length() +"\n";
			imprimir.append(linha);
		}
		
		arquivo.close();
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		return null;
		
		
//		Scanner sc = null;
//		try {
//
//			// leitor
//			for(int i = 0; i <= arq.length; i++) {
//			sc = (new Scanner(new FileReader(arq[i])));
//			}
//			// escritor
//
//			PrintStream ps = new PrintStream("./Output/saída.txt");
//
//			// percorre o arquivo
//
//			while (sc.hasNextLine()) {
//
//				String linha = sc.nextLine();
//
//				// Comprimento da String
//
//				int imprimir = linha.length();
//
//				int length = imprimir;
//
//				// grava no destino
//
//				ps.print(linha);
//				ps.println("----------------------------" + length);
//
//				System.out.println();
//
//			}
//
//			// fecha tudo
//
//			ps.close();
//
//			sc.close();
//
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//
//		}
//		return null;
//	}
//
//	public static void main(String[] args) {
//
//		// gravando
//
//		// metodoPorStream();
//
//		metodoPorScan(null);
//
//	}
	}
}