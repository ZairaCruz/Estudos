package com.livronovooracle;

public class TwoD {

	public static void main(String[] args) {
		int vertical, horizontal;
		int num[][] = new int[3][4];
		
		for(vertical = 0; vertical < 3; vertical++){
			for(horizontal = 0; horizontal < 4; horizontal++){
				num[vertical][horizontal] = (vertical*4)+ horizontal +1;
				System.out.print(num[vertical][horizontal]);
			}
		}

	}

}
