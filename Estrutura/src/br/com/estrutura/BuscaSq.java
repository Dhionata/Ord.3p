package br.com.estrutura;

public class BuscaSq {

	// Sequencial

	public static String buscaSequencial(String vet[], String valor, int tamanho) {

		for (int i = 0; i <= vet.length - 1; i++) {
			if (valor.equals(vet[i])) {
				return "A palavra " + valor + " foi encontrada!" + "�ndice do vetor: " + i;
			}
		}
		return "N�o foi encontrada a palavra " + valor + " no vetor.";
	}
}