package com.bruna.cursojava.aula69;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		//para ter um pouco mais de controle no exemplo, as Threads foram instanciadas aqui na main
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();
		
		//para a mensagem de programa finalizado seja mostrado somente no final execução da Thread podemos testar usar um for
		//mas esse teste não funcionou muito bem pois foi na base do chute o valor que i vale
		for (int i=0; i<16; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Programa finalizado");
	

	}

}
