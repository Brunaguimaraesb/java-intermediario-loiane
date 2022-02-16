package com.bruna.cursojava.aula68;

//criando uma Thread pela interface runnable
//com a classe Runnable, podemos extender qualquer outra classe
//se não for sobrepor qualquer outro metodo da classe Thread, pode ser melhor usar a classe Runnable
public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempoPausa;
	
	public MinhaThreadRunnable(String nome, int tempoPausa) {
		this.nome = nome;
		this.tempoPausa = tempoPausa;
		Thread t = new Thread(this);//this faz referencia a propria classe
		t.start();
	}
	
	@Override
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
