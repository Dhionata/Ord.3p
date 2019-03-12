package br.com.estrutura;

public class Teste {

	public static void main(String[] args) {

		Busca b1 = new Busca();
		Ordenação o1 = new Ordenação();

		System.out.println("Ordem Sequencial: " + b1.buscaSequencial());

		System.out.println("Ordem Binaria: " + b1.Binaria());

		System.out.println("Tempo nanosegundos: " + b1.total);

		System.out.println("Tempo milissegundos: " + b1.total1);

		System.out.println("Ordem de leitura: " + b1.Ler());

	}
}