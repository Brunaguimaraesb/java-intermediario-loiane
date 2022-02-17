package com.bruna.cursojava.aula75_84;

//String: fazendo buscas (indexOf, lastIndexOf, contains)
public class Aula79 {

	public static void main(String[] args) {

		String banana = "banana";
		String ana = "ana";
		//metodo que significa indice de - procura um caractere ou uma string e o java retorna o indice em que ele se encontra ou onde a string come�a, caso n�o encontre retorna -1
		System.out.println(banana.indexOf('x'));//-1 - n�o existe
		System.out.println(banana.indexOf('b'));//0 - primeira vez que aparece � na posi��o 0
		System.out.println(banana.indexOf('a'));//1 - primeira vez que aparece � na posi��o 1

		System.out.println(banana.indexOf(ana));//1 - primeira vez que o inicio da string aparece � na posi��o 1
		
		//procura a ultima vez que o caractere aparece e retorna a posi��o
		//a mesma coisa com a string, procura a ultima vez que o inicio da string aparece e retorna a posi��o
		System.out.println(banana.lastIndexOf('a'));//5
		System.out.println(banana.lastIndexOf(ana));//3
		
		//contains - procura se existe na string e retorna true ou false
		System.out.println(banana.contains(ana));//true
		System.out.println(banana.contains("ceu"));//false
	}

}
