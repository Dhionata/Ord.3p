package br.com.estrutura;

import java.util.Arrays;

//beta 1.4
public class Teste {

	public static void main(String[] args) {

		Busca b1 = new Busca();

		String[] blabla = { "eusoufoda", "Dhionat�", "oi", "pessoaslegaissempreselasc�o", "ouxit" };

		// System.out.println("Ordem Sequencial: " + Busca.buscaSequencial());

		// System.out.println("Ordem Binaria: " + Busca.Binaria());

		// System.out.println("Tempo nanosegundos: " + b1.total);

		// System.out.println("Tempo milissegundos: " + b1.total1);
		
		System.out.println("Teste: "+ b1.VetorCriar());
		

		// System.out.println("Ordem de leitura: " + Busca.Ler());

		// System.out.println("Tempo nanosegundos: ");

		Ordena��o.QuickSort(blabla, 0, blabla.length - 1);
		// Ordena��o.BubbleSort(blabla);
		// Ordena��o.InsertionSort(blabla);
		// Ordena��o.SelectionSort(blabla);

		System.out.println(Arrays.toString(blabla));
	}
}