package com.livronovooracle;

public class Queue {
	char q[]; //array que contém a fila
	int putloc, getloc; // os indices put e get
	
	Queue(int size){
		q = new char[size]; //aloca memoria para a fila
		putloc = getloc = 0;
	}
	
	void put(char ch){ //insere um caractere na fila
		if(putloc == q.length){
			System.out.println(" - Fila está cheia");
			return;
		}
		q [putloc++] = ch;
	}
	
	char get(){ //obtem um caractere a fila
		if(getloc == putloc){
			System.out.println(" - Fila está vazia");
			return (char) 0;
		}
		return q[getloc++];
	}
	
}
