package com.jamadeu.estruturadados.pilha;

import com.jamadeu.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

  public Pilha() {
    super();
  }

  public Pilha(int capacidade) {
    super(capacidade);
  }

  public void empilha(T elemento) {
    this.adiciona(elemento);
  }
}