package com.bruna.cursojava.aula59;

import static java.lang.Math.pow; 
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; //serve para importar todos os métodos da classe math

public class StaticImport {

	public static void main(String[] args) {
	//utilizando a classe math do java
		double a = 2;
		double b = 3;
		double c = 4;
	
	//são metodos estaticos pois não precisa instanciar
		System.out.println(Math.pow(a, b)); //eleva o numero
		
		System.out.println(Math.sqrt(c)); //acha  a raiz quadrada
		
	//para fazer o static import quando vai usar bastante o método, precisa fazer a importação
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));

	}

}
