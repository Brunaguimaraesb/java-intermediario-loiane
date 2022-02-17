package com.bruna.cursojava.aula75_84;

//String: juntando e separando String (join, split)
public class Aula82 {

	public static void main(String[] args) {
		//juntar strings
		String alfabeto = String.join(", ", "A", "B", "C", "D");//pertence a propria classe do string, juntando todos os elementos varargs atraves e uma virgula
		System.out.println(alfabeto);//A, B, C, D - imprime cada letra dessa utilizando a virgula para separar elas

		//separa strings
		String[] letras = alfabeto.split(", ");//delimitador entre as strings
		for (String letra : letras) {
			System.out.println(letra);//A B C D
		}

		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");//array
		/*for (String infos : infos) {
			System.out.println(infos);
		}*/
		//para transformar de string para inteiro usa o paseInt
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));//codigo pessoa; nome pessoa; idade pessoa
		System.out.println(pessoa);//imprime informações sobre a pessoa
	}

}
