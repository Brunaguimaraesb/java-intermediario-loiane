package com.bruna.cursojava.aula85_100;

import java.util.Calendar;

//Classe Calendar
// é uma classe abstrata
public class Aula87Calendar {

	// melhor forma de se trabalhar com data no java
	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); // singleton - getInstante já retorna um new calendar - já instanciado

		int ano = hoje.get(Calendar.YEAR);//passa a constante do ano
		int mes = hoje.get(Calendar.MONTH);//passa a constante do mes - janeiro 0, fevereiro 1...
		int dia = hoje.get(Calendar.DAY_OF_MONTH);//passa a constante do dia do mes
		int hora = hoje.get(Calendar.HOUR_OF_DAY);//passa a constante da hora
		int minutos = hoje.get(Calendar.MINUTE);//passa a constante dos minutos
		int segundos = hoje.get(Calendar.SECOND);//passa a constante dos segundos

		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);//Hoje é: 17/02/2022 12:36:34 - imprime o dia, mes, ano, hora ,minutos e segundos

		hoje.add(Calendar.DAY_OF_MONTH, -1);//subtrai um dia

		hoje.add(Calendar.DAY_OF_MONTH, 6);//adiciona seis dias

		System.out.println();//pula uma linha

		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));//22 imprime o dia do mes apos as alterações
		
		//System.out.println(hoje); //apresenta bastante informação atraves do toString
	}

}
