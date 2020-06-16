package com.jamadeu.estruturadados.pilha.teste;

import com.jamadeu.estruturadados.pilha.Pilha;

public class Aula17 {
  public static void main(String[] args) {

    Pilha<Integer> p = new Pilha<Integer>();

    System.out.println(p);
    System.out.println(p.desempilha());

    p.empilha(1);
    p.empilha(2);
    p.empilha(3);

    System.out.println(p);
    System.out.println(p.desempilha());
    System.out.println(p);
  }
}