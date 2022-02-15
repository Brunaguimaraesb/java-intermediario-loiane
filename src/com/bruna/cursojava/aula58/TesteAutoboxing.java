package com.bruna.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		//autoboxing e auto unboxing = processo de transformar um tipo primitivo em um objeto e vice versa

		//autoboxing = pegar os valores e colocar dentro de uma caixinha que representa o tipo primitivo - passa o tipo primitivo diretamente
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l; //new Long(10000l);
		Float num11 = 3.5f; //new Float(3.5f);
		Double num12 = 3.5555;
		Boolean flag2 = true;
		Character b_ = 'b';
		
		//auto unboxing =  pega uma classe e transforma em um tipo primitivo novamente
		 int num13 = num9;//num9.intValue();
		 
		 //autoboxing em expressões -  pode colocar diretamente
		 num9++;
		 
		 System.out.println(num9);
		 
		 //auto unboxing num9 -> autoboxing num13/num9 -> num14
		 Integer num14 = num13/num9;
		 
		 System.out.println(num14);
		 
		 //mau uso do autoboxing e auto unboxing
		 //se trabalhar com expressões e precisar manusear muito é melhor utilizar diretamente os tipos primitivos e depois faz a transformação para objeto
		 Double a, b, c; //autoboxing
		 a = 10.0;
		 b = 12.2;
		 c = 4.7;
		 
		 Double media = (a+b+c)/3; //auto unboxing
		 System.out.println(media);

	}

}
