package br.com.estrutura;

//beta 1.4
public class Teste {

	public static void main(String[] args) {

		String[] blabla = ArquivoHandler.VetorCriar("./Linguagem/dic.txt");

		String[] w = new String[blabla.length];

		// Arrays.sort(blabla);//ordenando alfabeticamente.

		// System.out.println("Tempo nanosegundos: " + b1.total);

		// System.out.println("Tempo milissegundos: " + b1.total1);

		// System.out.println("Teste: " + b1.VetorCriar());

		// System.out.println("Ordem de leitura: " + Busca.Ler());

		// System.out.println("Tempo nanosegundos: ");

		// Ordena��o.QuickSort(blabla, 0, blabla.length - 1);
		Ordena��o.MergeSort(blabla, w, 0, blabla.length - 1);
		// Ordena��o.BubbleSort(blabla);
		// Ordena��o.InsertionSort(blabla);
		// Ordena��o.SelectionSort(blabla);

		for (String pl : blabla) {
			System.out.println(pl);
		}

		// System.out.println("Ordem Sequencial: " + BuscaSq.buscaSequencial());

		// System.out.println("Ordem Binaria: ");
		// BuscaBi.BuscaBinaria();

		// System.out.println("Contagem nano: " + BuscaSq.finish);
		// System.out.println("Contagem mili: " + BuscaSq.finish1);
	}
}