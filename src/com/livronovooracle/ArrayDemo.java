package com.livronovooracle;

public class ArrayDemo {

	public static void main(String[] args) {
		char amostra[] = new char[10];
		int i;
		char ch = 70;
		
		for(i=0; i<10; i++)
			amostra[i] = ch++;
		
		for(i=0; i<10; i++)
			System.out.println("Amostra na posição " + i + " contém " + amostra[i]);
	}

}
