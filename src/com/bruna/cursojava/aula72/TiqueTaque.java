package com.bruna.cursojava.aula72;

//liberar temporariamente o controle do objeto permitindo que outra thread seja executada
//revezamento entre as threads: 
//wait - thread fica em modo de espera at� que seja notificada
//notify- notifica e retorna a execu��o da thread
//notifyAll - notifica todas as threads e ganha acesso ao objeto a que tem prioridade mais alta
public class TiqueTaque {
	
	boolean tique;
	//consegue controlar se o tique est� executando ou o taque est� executando
	synchronized void tique(boolean estaExecutando) {

		if (!estaExecutando) {//enquanto o tique estiver executando n�o sai do thread do tique
			tique = true;
			notify();
			return;
		}

		System.out.println("Tique ");

		tique = true;//porque estamos executando o tique

		notify();//notifica a thread do taque que pode ser executada tamb�m

		try {
			while (tique) {//espera pela execu��o
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void taque(boolean estaExecutando) {

		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");

		tique = false;

		notify();

		try {
			while (!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
