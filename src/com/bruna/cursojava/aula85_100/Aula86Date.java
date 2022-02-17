package com.bruna.cursojava.aula85_100;

import java.util.Date;

//Classe Date (Data)
public class Aula86Date {

	public static void main(String[] args) {

		Date hoje = new Date();//instancia 

		System.out.println(hoje);//retorna a data atual - dia da semana, mes, dia do mes, hora fuso horario e ano

		System.out.println("Milisegundos desde 1 de junho de 1970" + hoje.getTime());//retorna a quantidade de milisegundos desde 1 de junho de 1970

		System.out.println(hoje.getDate());//pega o dia do mes
	}

}
