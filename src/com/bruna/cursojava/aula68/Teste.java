package com.bruna.cursojava.aula68;

public class Teste {

	public static void main(String[] args) {
		//tres tarefas que realizam a execução em tempos diferentes
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		//Thread t1 = new Thread(thread1); //pode ser colocado diretamente no construtor para não ter trabalho repetitivo
		//t1.start();
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);

	}

}
