package com.bruna.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Formatando datas com SimpleDateFormat
public class Aula89SimpleDateFormat {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z Z");//utiliza as informações do proprio servidor, mostra o fuso horario 
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a Z");//mostra também se é am ou pm na hora
		
		SimpleDateFormat day = new SimpleDateFormat("d");
		
		SimpleDateFormat mes = new SimpleDateFormat("M");
		
		SimpleDateFormat ano = new SimpleDateFormat("y");

		Calendar data = new GregorianCalendar(2022, 1, 17, 14, 32, 25);//instanciando uma data especifica utiliza gregoriancalendar

		System.out.println(sdf.format(data.getTime()));//obtem a data do calendar - retorna a data atual e hora
		System.out.println(sdf1.format(data.getTime()));
		System.out.println(day.format(data.getTime()));
		System.out.println(mes.format(data.getTime()));
		System.out.println(mes.format(data.getTime()));

		Date hoje = new Date();
		
		System.out.println(sdf.format(hoje));//imprime a data de hoje

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");//passa uma string para data
		String minhaData = "17/02/2022";

		try {//precisa utilizar try catch pois pode lançar uma exceção
			Date minhaDataEmDate = sdf2.parse(minhaData);
			//parse é utilizado para retornar uma data ao inves de string
			System.out.println(minhaDataEmDate);
			
			System.out.println(sdf.format(minhaDataEmDate));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
