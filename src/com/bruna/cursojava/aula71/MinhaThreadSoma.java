package com.bruna.cursojava.aula71;


public class MinhaThreadSoma implements Runnable {
	
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();//instancia estatica da classe soma, todas as instancias da thread vai compartilhar a calculadora
	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();//precisa passar uma instancia da classe runnable
		//mesma coisa de fazer isso:
		//Thread t = new Thread(this,nome);
		//t.start();
	}

	@Override
	//precisa implementar o metodo run
	public void run() {
		System.out.println(this.nome + " iniciada");
		
		int soma = calc.somaArray(this.nums);//só chama o metodo
		
		System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);

		System.out.println(this.nome + " terminou a execução");
	}

}