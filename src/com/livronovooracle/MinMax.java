package com.livronovooracle;

public class MinMax {

	public static void main(String[] args) {
		int num[] = new int [] {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int min, max;
		
		min = max = num[0];
		try{
			for(int i= 0; i< 11; i++){
				if(num[i] < min) min = num[i];
				if(num[i] > max) max = num[i];
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("\nErro ao exceder limite do array");
		}
		System.out.println("\nMinimo " + min + "\nMáximo " + max);
	}

}
