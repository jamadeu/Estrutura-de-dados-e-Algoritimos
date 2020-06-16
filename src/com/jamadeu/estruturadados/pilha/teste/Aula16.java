package com.jamadeu.estruturadados.pilha.teste;

import com.jamadeu.estruturadados.pilha.Pilha;

public class Aula16 {
  public static void main(String[] args) {

    Pilha<Integer> p = new Pilha<Integer>();

    System.out.println(p.topo());
    System.out.println(p);

    p.empilha(1);
    p.empilha(2);

    System.out.println(p.topo());
    System.out.println(p);
  }
}