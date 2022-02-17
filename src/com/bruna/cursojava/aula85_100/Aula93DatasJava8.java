package com.bruna.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

//Data no Java 8+: LocalDate, LocalDateTime, LocalTime, ZoneId, ZoneDateTime
public class Aula93DatasJava8 {

	public static void main(String[] args) {

		// data dd MM yyyy
		LocalDate agora = LocalDate.now();//padrao ISO de dados - obtem o agora
		System.out.println(agora);//2022-02-17 - yyyy/MM/dd

		System.out.println(LocalDate.of(2022, 2, 17));//2022-02-17 - podemos passar o dia mes e ano
		System.out.println(LocalDate.parse("2022-02-17"));//2022-02-17 - para passar uma string utilizamos o parse

		System.out.println(agora.plusDays(30));//2022-03-19 - adiciona dias

		System.out.println(agora.minus(1, ChronoUnit.MONTHS));//2022-01-17 - volta no tempo, nesse exemplo volta um mes

		System.out.println(agora.getDayOfWeek());//THURSDAY - verifica o dia da semana
		System.out.println(agora.getDayOfMonth());//17 - verifica o dia do mes
		System.out.println(agora.getDayOfYear());//48 - dia do ano

		System.out.println(LocalDate.parse("2022-02-01").isLeapYear());//false - verifica se é ano bissexto

		// hora formato ISO
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);//14:54:00.351439700 imprime o horario de agora

		System.out.println(LocalTime.of(14, 59));//14:59 - passamos o horario
		System.out.println(LocalTime.parse("14:59"));//14:59 - fazemos o parse desde que esteja no formato ISO

		System.out.println(hAgora.plusMinutes(50));//15:51:08.568726700- conseguimos adicionar o tempo que vai adicionar, nesse caso foi segundos
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));//14:21:49.025199800 - diminui os minutos

		System.out.println(hAgora.getHour());//15 - pega o hora de agora

		// data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();//data completa
		System.out.println(agoraCompleto);//2022-02-17T15:03:14.847247700

		System.out.println(LocalDateTime.of(2022, 2, 17, 15, 05, 58));//fornece a data completa
		System.out.println(LocalDateTime.parse("2022-02-17T15:05:40"));//voce passa a data como string
		System.out.println(agoraCompleto.plusYears(20));//2042-02-17T15:05:05.162256400 -adiciona anos

		ZoneId fuso = ZoneId.systemDefault();//pegamos o fuso padrao do sistema
		System.out.println(fuso);//America/Sao_Paulo

		Set<String> fusos = ZoneId.getAvailableZoneIds();//retorna um set de strings

		/*conseguimos ver todas as zonas horarias
		 * for (String f : fusos) { 
		 * 		System.out.println(f); 
		 * }
		 */

		ZoneId sp = ZoneId.of("America/Sao_Paulo");//America/Sao_Paulo - configurar o fuso horario
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2022-02-17T15:10:10"), sp);//data e horario que tem fuso horario
		System.out.println(zdt);//2022-02-17T15:10:10-03:00[America/Sao_Paulo]
		System.out.println(ZonedDateTime.parse("2022-02-17T15:10:10-02:00[America/Sao_Paulo]"));//2022-02-16T19:25:10-03:00[America/Sao_Paulo] - passar uma string

		ZoneOffset offset = ZoneOffset.of("+02:00");//conseguimos trabalhar com offset passando o fuso horario
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);//passa o offset na data
		System.out.println(offsetdt);//2022-02-17T15:12:19.439421300+02:00
				
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);//faz a conversao - o toinstant substitiuiu o date
		System.out.println(ldtDate);//2022-02-17T15:17:29.729
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));//2022-02-17T15:17:29.737
	}

}