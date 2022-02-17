package com.bruna.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

//Trabalhando com BigDecimal e BigInteger
public class Aula98BigIntegerBigDecimal {
	
	public static void main(String[] args) {
		//usar double ou float quando queremos ter precisao decimal não é a melhor forma
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c); //0.010000000000000002
		
		//utilizados em casos em que utilizamos double ou float
		BigDecimal _a = new BigDecimal("0.03");//utiliza . como separador decimal no java
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);//utiliza o metodo subtract para subtracao no bigdecimal
		System.out.println(_c); //0.01

		BigDecimal bd1 = new BigDecimal("1234567890.0987654321");//pode ser feito baseados em strings ou numeros
		BigDecimal bd2 = new BigDecimal("987654321.9876543210");//pode ser feito baseados em strings ou numeros
		System.out.println(bd1.add(bd2)); //2222222212.0864197531 - utiliza o metodo add para adição no bigdecimal

		System.out.println(bd1.multiply(bd2)); //1219326312443225107.00289589987899710410 - utiliza o metodo mutiply para multiplicação no bigdecimal

		System.out.println(bd1.divide(new BigDecimal(2))); //617283945.04938271605 - utiliza o metodo divide para divisão no bigdecimal
		
		//utilizados em numeros inteiros
		BigInteger bi = new BigInteger("10000000000000000000");//pode ser feito baseados em strings ou numeros
		System.out.println(bi); //10000000000000000000

	}

}
