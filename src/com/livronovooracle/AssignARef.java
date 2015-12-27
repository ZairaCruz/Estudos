package com.livronovooracle;

public class AssignARef {

	public static void main(String[] args) {
		int[] num1 = new int[3];
		int[] num2 = new int[3];
		int[] num3 = new int[3];
		
		for(int i = 0; i < 3; i++){
			num1[i] = i + 1;
			num2[i] = i + 2;
			num3[i] = i + 10;
		}
		for(int i = 0; i < 3; i++){
			System.out.println(num1[i]+ ", "+ num2[i]+ ", "+ num3[i]+ " linha nº "+ (i + 1));
		}
	}

}
