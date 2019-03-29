package br.com.estrutura;

public class Busca {

	// Sequencial

	public static String buscaSequencial(String vet[], String valor) {

		for (int i = 0; i <= vet.length - 1; i++) {
			if (vet[i].equalsIgnoreCase(valor) == true) {
				return "A palavra " + valor + " foi encontrada!" + " Índice do vetor: " + i;
			}
		}
		return "Não foi encontrada a palavra " + valor + " no vetor.";
	}

	// Binária

	public static String buscaBinaria(String palavra, String[] dicionario) {

		String i = binario(dicionario, palavra);

		return i;

	}

	private static String binario(String[] aserachado, String palavra) {

		int meio, inicio, fim;

		inicio = 0;
		fim = aserachado.length - 1;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (aserachado[meio].length() == palavra.length()) {
				for (int i = meio; i <= fim; i++) {
					if (aserachado[i].equalsIgnoreCase(palavra) == true) {
						return "Palavra '" + palavra + "' na posição: " + i;
					}
				}
				for (int i = meio - 1; i >= inicio; i--) {
					if (aserachado[i].equalsIgnoreCase(palavra) == true) {
						return "Palavra '" + palavra + "' na posição: " + i;
					}
				}
			} else if (aserachado[meio].length() < palavra.length()) {
				inicio = meio + 1;
			} else if (aserachado[meio].length() > palavra.length()) {
				fim = meio - 1;
			}
		}
		return "Palavra '" + palavra + "' NÃO encontrada !";
	}
}