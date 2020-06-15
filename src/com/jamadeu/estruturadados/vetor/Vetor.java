package com.jamadeu.estruturadados.vetor;

public class Vetor {

  private String[] elementos;
  private int tamanho;
  
  public Vetor(int capacidade){
    this.elementos = new String[capacidade];
    this.tamanho = 0;
  }
  
  public boolean adiciona(String elemento) {
	  aumentaCapacidade();
	  if(this.tamanho < this.elementos.length) {
		  this.elementos[this.tamanho] = elemento;
		  this.tamanho++;
		  return true;
	  }
	  
	  return false;
  }
  
  public void adiciona(int posicao, String elemento) {
	  aumentaCapacidade();
	  if(!(posicao >=0 && posicao < tamanho)) {
		  throw new IllegalArgumentException("Posição inválida");
	  }	  
	  
	  for(int i = this.tamanho-1; i>=posicao; i--) {
		  this.elementos[i+1] = this.elementos[i];
	  }
	  
	  this.elementos[posicao] = elemento;
	  tamanho++;
  }
  
  private void aumentaCapacidade() {
	  if(this.tamanho == this.elementos.length) {
		  String[] elementosNovos = new String[this.elementos.length * 2];
		  
		  for (int i=0;i<this.elementos.length;i++) {
			  elementosNovos[i] = this.elementos[i];
		  }
		  
		  this.elementos = elementosNovos;
	  }
  }
  
  public String busca(int posicao) {
	  if(!(posicao >=0 && posicao < tamanho)) {
		  throw new IllegalArgumentException("Posição inválida");
	  }
	  
	  return this.elementos[posicao];
  }
  
  public int busca(String elemento) {
	  for(int i = 0; i<this.tamanho; i++) {
		  if(this.elementos[i].equals(elemento)) {
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
	  
	  	StringBuilder s = new StringBuilder();
	  	
	  	for (int i = 0; i< this.tamanho-1; i++) {
	  		s.append(this.elementos[i]);
	  		s.append(", ");
	  	}
	  	
	  	if(this.tamanho > 0) {
	  		s.append(this.elementos[tamanho-1]);
	  	}	  	
	  	
		return s.toString();
	}
}
