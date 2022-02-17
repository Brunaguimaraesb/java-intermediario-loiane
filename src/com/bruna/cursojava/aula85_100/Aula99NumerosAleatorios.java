package com.bruna.cursojava.aula85_100;

import java.util.Random;

//Números Aleatórios (Random)
public class Aula99NumerosAleatorios {

	public static void main(String[] args) {
		//gerar numeros aleatorios
		//opção 1 - utilizando a classe math
		System.out.println(Math.floor(Math.random() * 100));//96.0 - sorteia e redonda para baixo
		
		//gerar numeros aleatorios dentro de uma faixa por exemplo
		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt());//459998181

		System.out.println(aleatorio.nextInt(5 + 1));//3 sempre coloca o numero que quer que entre no sorteio + 1
	}
}
