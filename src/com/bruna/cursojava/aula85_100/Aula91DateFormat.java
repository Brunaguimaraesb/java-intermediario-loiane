package com.bruna.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//Formatando datas com DateFormat e Locale
public class Aula91DateFormat {

	public static void main(String[] args) {
		//data format é uma classe abstrata e a gente não consegue instanciar diretamente essa classe
		
		Date hoje = new Date();
		
		System.out.println(Locale.getDefault());//locale está pegando do sistema

		String hojeFormatado = DateFormat.getInstance().format(hoje);//formatar a data de acordo com o locale da aplicação
		System.out.println(hojeFormatado);//tem a formatação //dd/MM/yyyy HH:mm

		Locale.setDefault(new Locale("pt", "Brazil"));//mudamos o locale do servidor para o que escolhemos

		hojeFormatado = DateFormat.getInstance().format(hoje);//formata a data e horario
		System.out.println(hojeFormatado);//dd-MM-yyyy HH:mm
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);//formata só o horario
		System.out.println(hojeFormatado);//HH:mm:ss

		hojeFormatado = DateFormat.getDateInstance().format(hoje);//formata só a data
		System.out.println(hojeFormatado); //dd/MMM/yyyy -MMM - codigo do mes
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);//formata a data e horario
		System.out.println(hojeFormatado);//dd/MM/yyyy HH:mm:ss
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);//utilizando constante SHORT
		System.out.println(hojeFormatado);//HH:mm
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);//utilizando constante MEDIUM
		System.out.println(hojeFormatado);//HH:mm:ss
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);//utilizando constante LONG
		System.out.println(hojeFormatado);//HH:mm:ss e fuso horario

		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);//utilizando constante SHORT para os dois
		System.out.println(hojeFormatado);//dd-MM-yyyy HH:mm

		String data = "17-02-2022 14:25";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);//transformar em uma data
			System.out.println(dataDate);

			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);

			System.out.println(calendario);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
