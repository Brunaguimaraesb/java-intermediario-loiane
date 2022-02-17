package com.bruna.cursojava.aula75_84;

//String: modificando letras maiúsculas/minúsculas (toLowerCase, toUpperCase)
public class Aula81 {

	public static void main(String[] args) {

		String teste = "Teste";
		
		//poderia ser feito diretamente sem declarar variaveis
		//System.out.println(teste.toLowerCase());
		//System.out.println(teste.toUpperCase());

		String testeMinusc = teste.toLowerCase();//transforma todos os caracteres da string para minusculo
		String testeMaisc = teste.toUpperCase();//transforma todos os caracteres da string para maiusculo

		System.out.println(testeMinusc);//teste
		System.out.println(testeMaisc);//TESTE
		
		//if(teste.toLowerCase().equals(teste.toLowerCase()));//ao inves de usar o equalsIgnoreCase pode fazer dessa forma
	}

}
