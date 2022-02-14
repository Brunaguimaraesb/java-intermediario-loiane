package com.bruna.cursojava.aula55;

import com.bruna.cursojava.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		//utilizando o values obtem todos os valores que tem dentro de um determinado enumerador
		DiaSemana[] dias = DiaSemana.values();

		for (int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}

		System.out.println("\n");
		//for melhorado
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}

	}

}
