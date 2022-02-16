package com.bruna.cursojava.aula72;

//liberar temporariamente o controle do objeto permitindo que outra thread seja executada
//revezamento entre as threads: 
//wait - thread fica em modo de espera até que seja notificada
//notify- notifica e retorna a execução da thread
//notifyAll - notifica todas as threads e ganha acesso ao objeto a que tem prioridade mais alta
public class TiqueTaque {
	
	boolean tique;
	//consegue controlar se o tique está executando ou o taque está executando
	synchronized void tique(boolean estaExecutando) {

		if (!estaExecutando) {//enquanto o tique estiver executando não sai do thread do tique
			tique = true;
			notify();
			return;
		}

		System.out.println("Tique ");

		tique = true;//porque estamos executando o tique

		notify();//notifica a thread do taque que pode ser executada também

		try {
			while (tique) {//espera pela execução
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
