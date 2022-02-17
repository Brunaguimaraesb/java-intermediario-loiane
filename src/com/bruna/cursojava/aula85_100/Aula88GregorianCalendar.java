package com.bruna.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Classe GregorianCalendar
//a classe calendar é uma instancia da classe gregorianCalendar 
//a classe gregoriancalendar é uma subclasse da classe calendar
public class Aula88GregorianCalendar {

	public static void main(String[] args) {
		//como a classe gregoriancalendar extende a classe calendar então utilizamos o polimorfismo
		Calendar hoje1 = Calendar.getInstance();

		GregorianCalendar hoje = new GregorianCalendar();

		// System.out.println(hoje); //o tostring é bem similar ao da classe calendar

		imprimirData(hoje);//imprime a data de hoje

		System.out.println(hoje.isLeapYear(2020)); //true - ano bissexto

		GregorianCalendar hoje2 = new GregorianCalendar(2022, 1, 17);//passa ano, mes e dia do mes

		imprimirData(hoje2);//imprime a data que foi passada e hora zerada pois não foi passado nada

		GregorianCalendar hoje3 = new GregorianCalendar(2022, 1, 17, 14, 30, 23);//passa ano, mes, dia do mes, hora, minuto, segundo

		imprimirData(hoje3);//imprime a data e a hora que foi passada
	}
	//para conseguir chamar um método aqui dentro precisa usar o static
	private static void imprimirData(Calendar hoje) {

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		System.out.printf("Hoje é: %02d/%02d/%d %d:%d:%d", dia, (mes + 1), ano, hora, minutos, segundos);

		System.out.println();
	}

}
