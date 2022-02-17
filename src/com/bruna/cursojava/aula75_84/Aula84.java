package com.bruna.cursojava.aula75_84;

import java.util.StringTokenizer;

//String Tokenizer - podemos extrair informações de uma string grande 
public class Aula84 {

	public static void main(String[] args) {

		String doArquivo = "1;Bruna;30;";
		//extrair token da string que estamos extraindo informações
		StringTokenizer st = new StringTokenizer(doArquivo, ";");//passar qual string queremos extrair as informações e o delimitador

		while (st.hasMoreTokens()) {//string tokenTokenizer tem tokens
			System.out.println(st.nextToken());//extraimos a informação do stringTokenizer
		}

	}

}
