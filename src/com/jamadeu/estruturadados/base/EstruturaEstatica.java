package com.jamadeu.estruturadados.base;

public class EstruturaEstatica<T> {

  protected T[] elementos;
  protected int tamanho;

  @SuppressWarnings("unchecked")
  public EstruturaEstatica(int capacidade) {
    this.elementos = (T[]) new Object[capacidade];
  }

  public EstruturaEstatica() {
    this(10);
  }

  public boolean estaVazia(){
    return this.tamanho == 0;
  }

  protected boolean adiciona(T elemento) {
    this.aumentaCapacidade();
    if (this.tamanho < this.elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
      return true;
    }
    return false;
  }

  protected void remove(int posicao) {
    validaPosicao(posicao);
    for (int i = posicao; i < tamanho - 1; i++) {
      elementos[i] = elementos[i + 1];
    }
    tamanho--;
  }

  protected boolean adiciona(int posicao, T elemento) {

    validaPosicao(posicao);
    this.aumentaCapacidade();

    for (int i = this.tamanho - 1; i >= posicao; i--) {
      this.elementos[i + 1] = this.elementos[i];
    }
    this.elementos[posicao] = elemento;
    this.tamanho++;

    return true;
  }

  @SuppressWarnings("unchecked")
  protected void aumentaCapacidade() {
    if (this.tamanho == this.elementos.length) {
      T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
      for (int i = 0; i < this.elementos.length; i++) {
        elementosNovos[i] = this.elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }

  private void validaPosicao(final int posicao) {
    if (!(posicao >= 0 && posicao < tamanho)) {
      throw new IllegalArgumentException("Posição inválida");
    }
  }

  public int tamanho() {
    return this.tamanho;
  }

  @Override
  public String toString() {
    final StringBuilder s = new StringBuilder();

    s.append("[");

    for (int i = 0; i < this.tamanho - 1; i++) {
      s.append(this.elementos[i]);
      s.append(", ");
    }

    if (this.tamanho > 0) {
      s.append(this.elementos[tamanho - 1]);
    }

    s.append("]");

    return s.toString();
  }

}