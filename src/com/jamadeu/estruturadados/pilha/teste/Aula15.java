package com.jamadeu.estruturadados.pilha.teste;

import com.jamadeu.estruturadados.pilha.Pilha;

public class Aula15 {
  public static void main(String[] args) {

    Pilha<Integer> p = new Pilha<Integer>();

    System.out.println(p.estaVazia());

    p.empilha(1);

    System.out.println(p);
    System.out.println(p.estaVazia());
  }
}