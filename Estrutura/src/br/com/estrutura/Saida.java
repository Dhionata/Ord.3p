package br.com.estrutura;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.PrintStream;

import java.util.Scanner;

 

public class Saida {

 

 public static void metodoPorScan() {

         try {

                 // leitor

                 Scanner sc = new Scanner(new FileInputStream("./Linguagens/English.txt"));

 

                 // escritor

                 PrintStream ps = new PrintStream("./Output/saída.txt");

 

                 // percorre o arquivo

                 while (sc.hasNextLine()) {

                         String linha = sc.nextLine();

 

                         // grava no destino

                         ps.println(linha);

                 }

 

                 // fecha tudo

                 ps.close();

                 sc.close();

 

         } catch (FileNotFoundException e) {

                 e.printStackTrace();

         }

 }

 

 public static void main(String[] args) {

 

         // gravando

         // metodoPorStream();

         metodoPorScan();

 }

 

}