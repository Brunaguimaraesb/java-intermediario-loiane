package com.bruna.cursojava.aula69;

public class Teste2 {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();
		
		//ao inves de usar um for vai usar um while - enquanto as threads estiverem vivas, pede para a Thread do programa principal dormir e a mensagem de programa finalizado só apareça no final
		//deu certo o teste
		//mas está colocando uma logica de programação extra dentro do codigo do main para garantir que a mensagem só vai ser mostrada no final, mas não é um codigo muito limpo
		while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Programa finalizado");
	}

}
