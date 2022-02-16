package com.bruna.cursojava.aula69;

public class Teste3 {
	
	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 700);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		//utilizando o metodo join ele vai esperar a execução da Thread para só assim continuar o codigo
		// precisa de um try catch também, mas o metodo precisa ser colocado na ultima Thread para que a mensagem seja mostrada só no final do programa
		t1.start();
		
		/*try {
			t1.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		t2.start();
		
		/*try {
			t2.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		t3.start();
		
		try {
			t1.join(); //espera a execucao terminar
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Programa finalizado");
	}

}
