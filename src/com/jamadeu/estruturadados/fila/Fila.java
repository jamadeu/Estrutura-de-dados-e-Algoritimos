package com.jamadeu.estruturadados.fila;

import com.jamadeu.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

  public Fila() {
    super();
  }

  public Fila(int capacidade) {
    super(capacidade);
  }

  public void enfileira(T elemento) {
    this.adiciona(elemento);
  }

  public T espiar() {
    if (estaVazia()) {
      return null;
    }

    return this.elementos[tamanho - 1];
  }

  public T desinfileira(){
    if (this.estaVazia()) {
      return null;
    }

    return this.elementos[--tamanho];
  }
}