package com.bruna.cursojava.aula67;

//criando uma thread extendendo a classe thread
public class MinhaThread extends Thread {

	private String nome;
	private int tempoPausa;
	
	//construtor
	public MinhaThread(String nome, int tempoPausa) {
		this.nome = nome;
		this.tempoPausa = tempoPausa;
		//start-inicia o metodo run
		start();
	}
	
	//precisamos sobrescrever o metodo run
	public void run() {
		System.out.println(nome + " foi iniciada");
		//exceção verificada
		try {
		//run - executa a tarefa da thread
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				//sleep - coloca a thread para dormir por x milissegundos
				Thread.sleep(tempoPausa);
			}
		} catch (InterruptedException e) {//significa que a thread foi interrompida
			e.printStackTrace();
			System.out.println(nome + " execução foi interrompida");
		}

		System.out.println(nome + " terminou a execução");
	}

}
