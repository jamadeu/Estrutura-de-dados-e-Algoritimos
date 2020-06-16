package com.jamadeu.estruturadados.pilha.teste;

import java.util.Stack;

public class Aula18 {
  public static void main(String[] args) {

    // Pilha<Integer> p = new Pilha<Integer>();

    Stack<Integer> s = new Stack<Integer>();

    System.out.println(s.isEmpty());

    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println(s.isEmpty());
    System.out.println(s.size());
    System.out.println(s);
    System.out.println(s.peek());
    System.out.println(s.pop());
    System.out.println(s);
  }

}