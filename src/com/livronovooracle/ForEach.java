package com.livronovooracle;

public class ForEach {

	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		//usa la�o for de estilo for-each para exibir e somar os valores
		for( int x : num){
			System.out.println("O valor �: " + x);
			sum += x;
		}
		System.out.println("Somat�"
				+ "rio: " + sum);
	}

}
