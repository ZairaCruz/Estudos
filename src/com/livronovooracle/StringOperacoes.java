package com.livronovooracle;

public class StringOperacoes {

	public static void main(String[] args) {
		String str1 = "Quando se trata de programa��o Web, Java � # 1.";
		String str2 = new String(str1);
		String str3 = "Java string s�o poderosos.";
		int resultado, idx;
		char ch;
		
		System.out.println("Length of str1: " + str1.length());
		
		//exibe um caractere de cada vez de str1
		for(int i = 0; i < str1.length(); i++)
			System.out.println(str1.charAt(i));
		System.out.println();
		
		if(str1.equals(str2))
			System.out.println("Str1 � igual a str2");
		else
			System.out.println("Str1 � diferente de str2");
		
		if(str1.equals(str3))
			System.out.println("Str1 � igual a str3");
		else
			System.out.println("Str1 � diferente de str3");
		
		resultado = str1.compareTo(str3);
		if(resultado == 0)
			System.out.println("Str1 e Str3 s�o iguais");
		else if(resultado < 0)
			System.out.println("Str1 � menos que str3");
		else
			System.out.println("Str1 � maior que str3");
		
		str2 = "one two three one";
		idx = str2.indexOf("one");
		System.out.println("Index of first occurrence of \'one\': " + idx);
		idx = str2.lastIndexOf("one");
		System.out.println("Index of last occurrence of \'one\': " + idx);
	}
}
