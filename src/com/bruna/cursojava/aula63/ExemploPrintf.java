package com.bruna.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		System.out.printf("Olá, %s", "Mundo!");//passando string e passando um argumento dizendo que é do tipo string, nesse caso a frase foi concatenada 
		System.out.println();//pula linha
		System.out.printf("%S", "Olá,Mundo!"); //passa o texto para caixa alta
		System.out.println();
		
		System.out.printf("%c", 'c');//%c pode formatar caractere também
		System.out.println();
		System.out.printf("%C", 'c');//%C passa caractere para caixa alta
		System.out.printf("%n"); //é uma boa pratica com printf não utilizar \n para pular linha e sim usar %n
		
		int valor = 123456789;
		System.out.printf("%d", valor);	//formatação do numero inteiro utiliza %d
		System.out.printf("%n");
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);//para passar a saida do ponto flutuante utiliza %f	
		System.out.printf("%n");
		
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); //         Olá, Mundo! - sobra espaço representando os 20 caracteres, o alinhamento é a direita por padrão
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo); //Olá, Mundo!          - utilizando o sinal de menos o alinhamento passa a ser a esquerda
		System.out.printf("%n");

		System.out.printf("%+d", valor); //+123456789 - utilizando o sinal de mais ou menos entre a porcentagem e o d ele vai imprimir se o valor é positivo ou negativo
		System.out.printf("%n");
		System.out.printf("%015d", valor); //000000123456789 - colocando 0 e a quantidade de digitos, ele imprime o valor e completa o resto com zero
		System.out.printf("%n");
		System.out.printf("%,d", valor); //123.456.789 - colocando a virgula ele separa os milhares com pontos
		System.out.printf("%n");

		int valor2 = -123456789;
		System.out.printf("% d", valor2); //-123456789 - se colocar espaço antes do d, imprime o valor com o sinal de - caso seja negativo
		System.out.printf("%n");
		System.out.printf("% d", valor); // 123456789 - se colocar espaço antes do d, imprime o valor com um espaço antes do numero caso seja positivo
		System.out.printf("%n");

		System.out.printf("%.3f", pontoFlutuante);	//3,146 - faz a formatação atribuindo a quantidade de casas decimais após a virgula
		System.out.printf("%n");

		System.out.printf("R$%10.2f", pontoFlutuante);	//R$      3,15 - saida com numero monetario utiliza o R$ e 10.2f
		System.out.printf("%n");

		testeMaisCompleto(); 
		/* Retorno
		Item 01: total de R$ 10.000,00
		Item 02: total de R$    123,54
		Item 03: total de R$  7.843,57
		Item 04: total de R$      1,00
		Item 05: total de R$      4,57 */
	}
	
	public static void testeMaisCompleto() {//imprime nota fiscal
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);//string, inteiro apresentando o zero antes do numero e a quantidade de casas, total do valor em reais com duas casas de precisão no ponto flutuante,depois passa os argumentos 
		}
					
		// Na vida real não utiliza muito o printf, utilizamos a classe Java.util.Formater que tem a mesma função do printf
		// pode utilizar o System.out.format no lugar de System.out.printf que faz a mesma coisa
	}


}
