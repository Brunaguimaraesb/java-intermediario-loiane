package com.bruna.cursojava.aula75_84;

//String: fazendo buscas (indexOf, lastIndexOf, contains)
public class Aula79 {

	public static void main(String[] args) {

		String banana = "banana";
		String ana = "ana";
		//metodo que significa indice de - procura um caractere ou uma string e o java retorna o indice em que ele se encontra ou onde a string começa, caso não encontre retorna -1
		System.out.println(banana.indexOf('x'));//-1 - não existe
		System.out.println(banana.indexOf('b'));//0 - primeira vez que aparece é na posição 0
		System.out.println(banana.indexOf('a'));//1 - primeira vez que aparece é na posição 1

		System.out.println(banana.indexOf(ana));//1 - primeira vez que o inicio da string aparece é na posição 1
		
		//procura a ultima vez que o caractere aparece e retorna a posição
		//a mesma coisa com a string, procura a ultima vez que o inicio da string aparece e retorna a posição
		System.out.println(banana.lastIndexOf('a'));//5
		System.out.println(banana.lastIndexOf(ana));//3
		
		//contains - procura se existe na string e retorna true ou false
		System.out.println(banana.contains(ana));//true
		System.out.println(banana.contains("ceu"));//false
	}

}
