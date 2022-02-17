package com.bruna.cursojava.aula75_84;

//String: comparação de Strings (equalsIgnoreCase, regionMatches, startWith, endsWith, compareTo)
public class Aula78 {

	public static void main(String[] args) {

		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);
		//equals - compara strings
		System.out.println("ola equals ola2 = " + ola.equals(ola2)); // false - conteudos diferentes
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); // true - mesmo conteudo

		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); // true - não verifica diferenças entre maiusculo e minusculo

		System.out.println("ola == ola2 " + (ola == ola2)); // false
		System.out.println("ola == ola3 " + (ola == ola3)); // true - aponta para uma referencia que ja existe

		System.out.println("ola == ola4 " + (ola == ola4)); // false - referencia criada para ola4 é diferente
		System.out.println("ola equals ola4 = " + ola.equals(ola4)); // true - conteudo da string é o mesmo
		System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); // true - conteudo da string é o mesmo

		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		//regionMatches - compara região da primeira string com as outras duas, passamos quais caracteres queremos comparar dessas regiões
		System.out.println(banana.regionMatches(1, ana, 0, 3));//true - existe ana na palavra banana a partir da posição 1
		System.out.println(banana.regionMatches(2, ana, 1, 2));//true - dá um match
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));//true - utilizando o ignore case

		System.out.println(banana.endsWith(ana));//compara se termina com os caracteres indicados
		System.out.println(banana.startsWith(ban));//compara se começa com os caracteres indicados

		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		//trabalhando com ordenação de objetos utiliza bastante o compareTo
		System.out.println(a.compareTo(b));//-1 - a é maior b
		System.out.println(b.compareTo(a));//1 ou maior que 1 - b é menor que a
		System.out.println(a.compareTo("a"));//0 pois são iguais
		System.out.println(a.compareTo(aMaiusculo));//32 - diferença da dos valores tabela ascii

		// -1 quando a > b
		// 0 quando a == b
		// 1 ou >1 quando a<b
	}

}
