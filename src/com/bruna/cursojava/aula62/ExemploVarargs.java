package com.bruna.cursojava.aula62;
//recurso que permite que passe infinitos parâmetros para um metodo sem ter que declarar todos os parametros
public class ExemploVarargs {

	public static void main(String[] args) {
		
		System.out.println(soma(1,2));//só consegue chamar o metodo com dois numeros pois só foram declarados 2 variaveis
		System.out.println(soma(1,2,3));//só consegue chamar o metodo com tres numeros pois só foram declarados 3 variaveis
		
		int [] vetor = {1, 2, 3, 4, 5};//inicializa o vetor direto usando chaves
		
		System.out.println(soma(vetor));//aqui chama o metodo
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));//insere quantos parametros quiser	- nesse caso os dois primeiros numeros não vao ser considerados varargs pois no metodo foram declarados dois inteiros antes dele
	}
	//soma de dois parametros
	static int soma(int a, int b) {
		return a + b;
	}
	//soma de três parametros
	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	//fazer o somatorio de n numeros é preciso declarar um vetor e iterar ele atraves do for
	static int soma(int [] vetor) {
		
		int total = 0;
		
		for (int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
	}
	//utilizando o varargs - aceita somente parametros que sao de classes
	static int soma(int a, int b, Integer... vetor) {//... significa que são n numeros, se precisar declarar outros parametros de outros tipos tem que declarar antes do varargs
		
		int total = 0;
		
		for (int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
	}
}
