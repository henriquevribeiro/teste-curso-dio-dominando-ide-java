package com.dio;

import com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		gato Gato = new gato(); 
		Livros livros = new Livros();
		
		System.out.println(Gato);
		System.out.println(livros);
		
	/*	int a = 2;
		int b = 3;
		System.out.println("hello world " + (a + b)); */

	}

}

class Livros {
	 private String nome;
	 private String npag;
}