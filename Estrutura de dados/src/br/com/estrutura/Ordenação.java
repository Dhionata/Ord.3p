package br.com.estrutura;
import java.util.*;


public class Ordenação {

	public static void main(String[] args) {
		
		//0.3 alpha kk
	
		String [] palavras = {"goiaba","melancia","ovo","pinga","Dhionatã"};

		Arrays.sort(palavras);
		for(String pl: palavras) {
			System.out.println(pl);
		}
	}
}