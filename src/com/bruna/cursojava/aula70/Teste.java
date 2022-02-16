package com.bruna.cursojava.aula70;

import com.bruna.cursojava.aula69.MinhaThreadRunnable;

//definindo prioridades
public class Teste {
	
public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		//instanciando as Threads
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		//estabelecendo prioridades utilizando a classe Priority
		//não é uma regra, mas na maioria das vezes é respeitada
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		//t1.setPriority(Thread.NORM_PRIORITY); //a classe Thread também tem constantes, então pode utilizar as constantes ao inves de numeros
		
		//chamar o metodo start para as tres Threads
		//a ordem fica variando um pouco, dependendo de varios fatores, por exemplo como prioridade delas
		t1.start();
		t2.start();
		t3.start();
	}

}
