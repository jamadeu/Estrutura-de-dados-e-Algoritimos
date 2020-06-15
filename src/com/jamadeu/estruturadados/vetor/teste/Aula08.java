package com.jamadeu.estruturadados.vetor.teste;

import com.jamadeu.estruturadados.vetor.Vetor;

public class Aula08 {

	public static void main(String[] args) {
Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
		
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
		
		

	}

}
