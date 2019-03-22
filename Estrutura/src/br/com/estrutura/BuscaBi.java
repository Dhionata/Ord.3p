package br.com.estrutura;

public class BuscaBi {

	// Busca binaria

	public static int buscaBinaria(String palavra, String[] dicionario) {

		String[] aserachado = dicionario;

		int i = binario(aserachado, palavra);
		
		return i;

	}

	private static int binario(String[] aserachado, String palavra) {
		
		int meio, inicio, fim;

		inicio = 0;
		
		fim = aserachado.length - 1;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (aserachado[meio].length() == palavra.length()) {
				return meio;
			} else if (aserachado[meio].length() < palavra.length()) {
				inicio = meio + 1;
			} else if (aserachado[meio].length() > palavra.length()) {
				fim = meio - 1;
			}
		}
		return -1;
	}
}