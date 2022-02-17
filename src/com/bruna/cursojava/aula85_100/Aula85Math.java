package com.bruna.cursojava.aula85_100;

//Class Math
public class Aula85Math {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3)); //8 - eleva o numero a uma potencia

		System.out.println(Math.round(4.7)); //5 - arredonda o numero para cima a partir de x.5

		System.out.println(Math.round(4.4)); //4 - arredonda o numero para baixo abaixo de x.5

		System.out.println(Math.ceil(4.4)); //5.0 - arredonda o numero com casa decimal para cima

		System.out.println(Math.ceil(4.7)); //5.0 - arredonda o numero com casa decimal para cima

		System.out.println(Math.floor(4.4)); //4.0 - arredonda o numero com casa decimal para baixo

		System.out.println(Math.floor(4.7)); //4.0 - arredonda o numero com casa decimal para baixo

		//LINGUAGEM JAVA TEM UM GRANDE PROBLEMA PARA NUMEROS - não é uma linguagem 100% segura para se trabalhar com numeros mas utilizando o bigNumber e bigDecimal conseguimos fazer contas mais precisas
		System.out.println(Math.round(Math.random() * 100)); //round - arredonda o numero para numeros de 0 a 100 - random - gera numero aleatorio

		System.out.println(Math.sin(Math.toRadians(30)));//funcoes trigonometricas - seno e toRadians transforma o numero de radianos para graus

		System.out.println(Math.cos(Math.toRadians(1)));//funcoes trigonometricas - cosseno e toRadians transforma o numero de radianos para graus

		System.out.println(Math.tan(Math.toRadians(45)));//funcoes trigonometricas - tangente e toRadians transforma o numero de radianos para graus
	}

}
