package com.bruna.cursojava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

//Formatando Números: DecimalFormat
public class Aula97DecimalFormat {
	// formatar numeros quando precisamos de mais precisão ou controle sobre como o
	// numero vai ser formatado utilizamos o decimalformat
	public static void main(String[] args) {

		String padrao = "###,###.##";//definindo o padrão do numero
		DecimalFormat df = new DecimalFormat(padrao);//instancia passando o padrao

		// df.applyPattern(padrao);//outra forma de fazer 
		System.out.println(df.format(1234567890.123));//1.234.567.890,12 - formatar o numero

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));//define que a formatação dos simbolos
		dfs.setDecimalSeparator(',');//separar os decimais
		dfs.setGroupingSeparator('.');//separar os inteiros

		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(1234567890.123));//1.234.567.890,12

		String padrao3 = "###,###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);//define o agrupamento dos numeros
		System.out.println(df.format(1234567890.123));//12.3456.7890,12

		String padrao4 = "\u00A4###,###,000.00%";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));//¤010,00% - valor monetario

	}
}