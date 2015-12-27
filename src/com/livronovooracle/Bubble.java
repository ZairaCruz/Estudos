package com.livronovooracle;

public class Bubble {

	public static void main(String[] args) {
		int num[] = new int [] {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int a, b, t, tamanho= 10;
		
		System.out.println("Array original: ");
		for(int i= 0; i< tamanho; i++)
			System.out.println(" " + num[i]);
		System.out.println();
		
		for(a= 1; a< tamanho; a++){
			for(b=tamanho -1; b>=a; b--){
				if(num[b-1] > num[b]){
					//troca elementos
					t = num[b-1];
					num[b-1] = num[b];
					num[b] = t;
				}
			}
		}
		//exibe o array classificado
		System.out.println("Array organizado: ");
		for(int i= 0; i< tamanho; i++)
			System.out.println(" " + num[i]);
		System.out.println();

	}

}
