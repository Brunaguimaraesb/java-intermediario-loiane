package com.bruna.cursojava.aula75_84;

//String: modificando uma String (substring, concat, replace, trim)
public class Aula80 {

	public static void main(String[] args) {

		String teste = "Isso é um teste.";

		System.out.println(teste);//imprime na tela
		
		//sub de uma string, pedaço da string - conseguimos extrair um pedaço da string de forma informativa
		System.out.println(teste.substring(10));//teste. - pega a partir do indice informado
		System.out.println(teste.substring(10, 15));////teste - pega somente o intervalo que foi solicitado

		String ola = "olá";
		String mundo = " mundo";
		//ele faz a concatenação
		String olaMundo = ola.concat(mundo); 
		System.out.println(olaMundo);// ola + mundo -ola mundo

		String espacos = "i s p a ç o";
		//corrige fazendo um replace, fazendo uma substituição
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);//e s p a ç o
		
		//o replaceAll vai substituir todos os espaços por uma string vazia
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);//espaço
		
		String nome = " meu nome é: ";
		System.out.println(nome);// meu nome é:  - tem espaço antes e depois da frase
		//o metodo trim remove todos os espaços sobrando antes e depois
		System.out.println(nome.trim());//meu nome é:
	}	

}
