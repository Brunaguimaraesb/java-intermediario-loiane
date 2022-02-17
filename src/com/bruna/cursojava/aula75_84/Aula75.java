package com.bruna.cursojava.aula75_84;

//string: contrutores
public class Aula75 {
	
public static void main(String[] args) {
		
		String vazia = new String();//atrav�s do operador new porque String � uma classe e usa o construtor padr�o(vazio)
		System.out.println(vazia);//""
		
		String java = new String("JAVA");//podemos passar uma string para o construtor dessa string
		System.out.println(java);
		
		String java1 = new String(java);//podemos criar uma string a partir de uma outra string
		System.out.println(java1);
		
		char[] charsJava = {'J', 'A', 'V', 'A'};//podemos criar um array de char e podemos iniciar ele utilizando chaves e aspas simples
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};//podemos criar um array escolhendo somente algumas posi��es utilizando o offset
		String abc = new String(abcdef, 0, 3);
		System.out.println(abc);
		
		byte[] ascii = {65, 66, 67, 68, 69};//podemos trabalhar com um array de byte e cada caractere tem valor da tabela ascii
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		String bcd = new String(ascii, 1, 3);//podemos passar com o offset escolhendo as posi��es
		System.out.println(bcd);
		
		String java3 = "JAVA";//atribui��o simples do java
		String java4 = "JAVA";//java3 e java4 est�o apontando para o mesmo refer�ncia de memoria do java

		System.out.println(java3);
		System.out.println(java4);

	}

}
