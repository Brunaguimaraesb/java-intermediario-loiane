package com.bruna.cursojava.aula71;

//sincroniza��o - coordena as atividades de 2 ou mais threads
//para 2 ou mais threads n�o  acessar o mesmo recurso ao mesmo tempo � preciso sincronizar
//utiliza a palavra chave synchronized em metodos ou blocos de codigo
public class Calculadora {

	private int soma;
	//inicialmente � um metodo que soma os valores do array e vai retornando
	//utilizando synchronized, � possivel fazer a soma de uma unica thread por vez
	public synchronized int somaArray(int[] array) {

		soma = 0;

		for (int i = 0; i < array.length; i++) {

			soma += array[i];

			System.out.println("Executando a soma " + Thread.currentThread().getName() + 
					" somando o valor " + array[i] + " com total de " + soma);

			try {
				Thread.sleep(100);//cada passada de for, d� uma pequena pausa
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		return soma;
	}

}
