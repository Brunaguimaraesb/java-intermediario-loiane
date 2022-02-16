package com.bruna.cursojava.aula69;

//Classe Runnable n�o representa uma Thread mas sim uma instancia de execu��o da thread
public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempoPausa;
	
	public MinhaThreadRunnable(String nome, int tempoPausa) {
		this.nome = nome;
		this.tempoPausa = tempoPausa;
		//Thread t = new Thread(this); //por isso foi passado dentro do construtor a Thread
		//t.start();
	}
	
	@Override
	//precisamos sobrescrever o metodo run
	//metodo obrigatorio
	//responsavel por executar a tarefa que a Thread tem que executar
	public void run() {

		System.out.println(nome + " foi iniciada");
		//exce��o verificada
		try {
		//run - executa a tarefa da thread
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				//sleep - coloca a thread para dormir por x milissegundos
				Thread.sleep(tempoPausa);
			}
		} catch (InterruptedException e) {//significa que a thread foi interrompida
			e.printStackTrace();
			System.out.println(nome + " execu��o foi interrompida");
		}
		System.out.println(nome + " terminou a execu��o");
			
	}

}