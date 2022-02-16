package com.bruna.cursojava.aula74;

//bloqueia um recurso que outra thread ou processo quer usar, se chama deadlock
public class Deadlock {
	
	public static void main(String[] args) {
		//objetos que as threads querem usar
		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";
		//classe anonima
		Thread t1 = new Thread() {
			public void run() {
				synchronized (RECURSO1) {//acessa o primeiro recurso
					System.out.println("Thread #1: bloqueou recurso 1");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Thread #1: tentando o acesso ao recurso 2");

					synchronized (RECURSO2) {
						System.out.println("Thread #1: bloqueou recurso 2");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (RECURSO2) {
					System.out.println("Thread #2: bloqueou recurso 2");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Thread #2: tentando o acesso ao recurso 1");

					synchronized (RECURSO1) {
						System.out.println("Thread #2: bloqueou recurso 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}

}
