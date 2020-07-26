package br.com.estrutura;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Saida {

    public static void metodoPorScan(String[] arquivo) {

        try {
            PrintStream ps = new PrintStream("./Output/saida.txt");
            String linha;

            for (String s : arquivo) {
                linha = s + "     ----" + s.length() + "\n";
                ps.print(linha);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}