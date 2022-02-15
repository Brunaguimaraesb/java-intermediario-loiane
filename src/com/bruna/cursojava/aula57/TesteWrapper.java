package com.bruna.cursojava.aula57;

public class TesteWrapper {
	
	public static void main(String[] args) {
	//essa classe representa os tipos primitivos do java
		
		//tipos primitivos do java
		//representam os numeros inteiros do java
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		//representam os pontos flutuantes
		float num5 = 3.5f;
		double num6 = 3.55555;
		//representa true ou false
		boolean flag = true;
		//representa apenas um caractere
		char a = 'a';
		
		//classes do java que representam os tipos primitivos
		//representam os numeros inteiros
		Short num7 = new Short((short) 1); //faz a conversão
		Byte num8 = new Byte((byte) 10); //faz a conversão
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		//pontos flutuantes
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		//consegue também passar uma string - pode disparar uma exceção do tipo NumberFormatException
		Integer num13 = new Integer("1000");
		Double num14 = new Double("3.5");
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue(); //pode mudar o tipo, mas precisa ter cuidado com certas conversões para não perder precisão
		
		int num16 = Integer.parseInt("100000"); //trasforma a string para o valor inteiro utilizando o parse
		
		double num17 = Double.parseDouble("3.5555"); //pode disparar uma exceção do tipo NumberFormatException
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1343); //transforma o numero primitivo para a instancia de um objeto
		System.out.println(num18);
		
		System.out.println(num9 == num13); //pode fazer comparação de numeros primitivos

	}

}
