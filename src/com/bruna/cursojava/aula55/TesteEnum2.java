package com.bruna.cursojava.aula55;

import com.bruna.cursojava.aula53.DiaSemana;

public class TesteEnum2 {
	//utilizando o valueOf consegue obter o valor através da string
	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

		System.out.println(dia);

	}

}
