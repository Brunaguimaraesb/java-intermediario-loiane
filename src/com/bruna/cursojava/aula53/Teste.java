package com.bruna.cursojava.aula53;

public class Teste {

	public static void main(String[] args) {
		
		usandoConstantes();
		
		System.out.println();
		
		usandoEnum();

	}
	
	private static void usandoConstantes() {
		//uso das constantes e conseguir imprimir cada constante na tela
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java\n");
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(int dia) {
		//metodo para imprimir o dia da semana na tela
		switch(dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}
	
	private static void usandoEnum() {
	//é muito mais elegante quando está declarando uma classe utilizando enum, você tem o controle dos valores que podem ser atribuidos são só os que podem ser declarados no enum 	
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("\nTeste utilizando enum no Java\n");

		imprimeDiaSemanaEnum(segunda);
		imprimeDiaSemanaEnum(terca);
		imprimeDiaSemanaEnum(quarta);
		imprimeDiaSemanaEnum(quinta);
		imprimeDiaSemanaEnum(sexta);
		imprimeDiaSemanaEnum(sabado);
		imprimeDiaSemanaEnum(domingo);
	}
	

	private static void imprimeDiaSemanaEnum(DiaSemana dia) {
		//metodo para imprimir o dia da semana na tela utilizando enum	
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
}
