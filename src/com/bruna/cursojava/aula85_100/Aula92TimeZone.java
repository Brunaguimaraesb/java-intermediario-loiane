package com.bruna.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//TimeZone (Fuso Horário)
public class Aula92TimeZone {

	public static void main(String[] args) {
		//para padronizar o fuso horario

		Calendar calendar = Calendar.getInstance();//para pegar uma data atual
		TimeZone tz = calendar.getTimeZone();//pegar o fuso horario

		System.out.println(tz); // BRT
		
		//para saber quais fuso horarios existem no java
		/*String[] fusos = TimeZone.getAvailableIDs();
		 * for (String fuso: fusos) {
		 * 		System.out.println(fuso);
		 *}*/

		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");//configurar um fuso horario padrao

		System.out.println(tzSP.getDisplayName());//obter o display name - Horário Padrão de Brasília
		System.out.println(tzSP.getID());//America/Sao_Paulo

		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");//converter datas e salvar
		System.out.println(sdf.format(agora.getTime()));//17-fev-2022 02:38:51 PM BRT

		Calendar agoraSP = Calendar.getInstance(tzSP);//criar uma outra data
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));//17-fev-2022 02:38:51 PM BRT

		agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);//obter o horario real
		System.out.println(sdf.format(agoraSP.getTime()));//17-fev-2022 11:38:51 AM BRT - em NY
	}

}
