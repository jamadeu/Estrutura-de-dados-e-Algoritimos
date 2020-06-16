package com.jamadeu.estruturadados.vetor;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	@SuppressWarnings("unchecked")
	public Lista(final int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(final T elemento) {
		aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;
	}

	public void adiciona(final int posicao, final T elemento) {
		aumentaCapacidade();
		validaPosicao(posicao);

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		tamanho++;
	}

	public void remove(final int posicao) {
		validaPosicao(posicao);
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;
	}

	private void validaPosicao(final int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
	}

	@SuppressWarnings("unchecked")
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			final T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}

			this.elementos = elementosNovos;
		}
	}

	public T busca(final int posicao) {
		validaPosicao(posicao);

		return this.elementos[posicao];
	}

	public int busca(final T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
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
