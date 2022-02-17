package com.bruna.cursojava.aula75_84;

//String: modificando uma String (substring, concat, replace, trim)
public class Aula80 {

	public static void main(String[] args) {

		String teste = "Isso � um teste.";

		System.out.println(teste);//imprime na tela
		
		//sub de uma string, peda�o da string - conseguimos extrair um peda�o da string de forma informativa
		System.out.println(teste.substring(10));//teste. - pega a partir do indice informado
		System.out.println(teste.substring(10, 15));////teste - pega somente o intervalo que foi solicitado

		String ola = "ol�";
		String mundo = " mundo";
		//ele faz a concatena��o
		String olaMundo = ola.concat(mundo); 
		System.out.println(olaMundo);// ola + mundo -ola mundo

		String espacos = "i s p a � o";
		//corrige fazendo um replace, fazendo uma substitui��o
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);//e s p a � o
		
		//o replaceAll vai substituir todos os espa�os por uma string vazia
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);//espa�o
		
		String nome = " meu nome �: ";
		System.out.println(nome);// meu nome �:  - tem espa�o antes e depois da frase
		//o metodo trim remove todos os espa�os sobrando antes e depois
		System.out.println(nome.trim());//meu nome �:
	}	

}
