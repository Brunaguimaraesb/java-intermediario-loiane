package com.bruna.cursojava.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

//Formatando Números: NumberFormat
public class Aula96NumberFormat {
	//queremos formatar um numero mas não precisamos uma precisao muito alta
	public static void main(String[] args) throws ParseException {

		// 1.000,00 - Brasil
		// 1,000.00 - EUA

		Locale en = new Locale("en", "United States");//padrao americano
		NumberFormat nf = NumberFormat.getInstance(en);//instancia do numberformat de acordo com o locale

		String num = nf.format(100.99);//formatar um numero
		System.out.println(num);//100.99

		Locale br = new Locale("pt", "Brazil");//padrao do Brasil
		nf = NumberFormat.getInstance(br);//instancia do numberformat
		num = nf.format(100.99);
		System.out.println(num);//100,99

		// MOEDA
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());//pode obter a instancia com o locale local do computador ou passar a instancia

		String valor = moeda.format(100.99);//formata valor
		System.out.println(valor);//R$ 100,99

		Currency currency = moeda.getCurrency();//ajuda a trabalhar com moeda - pega o objeto de moeda a partir do numberformat
		System.out.println(currency);//BRL

		// PORCENTAGEM
		NumberFormat porcent = NumberFormat.getPercentInstance();//utiliza o locale padrao ou pode passar um locale
		String porcentagem = porcent.format(99.987);//formata o numero
		System.out.println(porcentagem);//9.999%
		
		//configura a moeda manualmente
		porcent.setMaximumIntegerDigits(7);//casas inteiras maximo
		porcent.setMinimumIntegerDigits(5);//casas inteiras mininmo

		porcent.setMaximumFractionDigits(2);//casas decimais maximo
		porcent.setMinimumFractionDigits(1);//casas decimais minimo

		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);//09.998,7%

		// ARREDONDAMENTO
		nf = NumberFormat.getInstance(Locale.getDefault());

		nf.setRoundingMode(RoundingMode.UP);//setar arredondamento UP - sempre pra cima
		nf.setMaximumFractionDigits(0);//maximo casa decimal
		nf.setMinimumFractionDigits(0);//minimo casa decimal
		System.out.println(nf.format(99.50));//100

		Number num3 = nf.parse("100.00");//transformar uma string em um numero de acordo com as informações que estão no numberformat
		System.out.println(num3.intValue());//10000
	}

}
