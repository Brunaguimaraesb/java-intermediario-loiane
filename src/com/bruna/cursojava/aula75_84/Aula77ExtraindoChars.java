package com.bruna.cursojava.aula75_84;

import java.util.Arrays;

//string: extraindo chars(charAt, getChars, getBytes,toCharArray)
public class Aula77ExtraindoChars {
	
	public static void main(String[] args) {

		String java = "Java";//array de caracteres
		
		//charAt - conseguimos acessar cada caractere que está dentro da string
		for (int i = 0; i < java.length(); i++) {
			System.out.println(java.charAt(i));// J a v a
		}
		//getChars - extrai caracteres da string e atribuir os mesmos a um array de chars
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);//primeiro caractere, ultimo caractere que quer copiar, qual destino-array jav,inicio na primeira posição do array
		System.err.println(jav);// Jav

		// o exemplo acima é o mesmo que:
		for (int i = 0, j = 0; i < 3; i++, j++) {
			jav[j] = java.charAt(i);
		}
		System.out.println(jav);//Jav
		//arrays.toString é uma maneira simples de transformar todo o array em string
		byte[] javBytes = new byte[3];//podemos fazer a mesma coisa para array de bytes
		java.getBytes(0, 3, javBytes, 0);
		System.out.println(Arrays.toString(javBytes));//[74, 97, 118]- formato ascii

		char[] javaChars = java.toCharArray();//transforma uma string em um array de char
		System.out.println(javaChars);//Java
	}

}
