package com.bruna.cursojava.aula67;

public class Teste {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread( "Thread #1", 600); //0,6 segundos
		//therad.start(); //para não precisar ficar chamando o tempo todo o metodo run podemos colocar ele dentro do proprio construtor 
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900); //0,9 segundos
		MinhaThread thread3 = new MinhaThread("Thread #3", 500); //0,5 segundos

	}

}
