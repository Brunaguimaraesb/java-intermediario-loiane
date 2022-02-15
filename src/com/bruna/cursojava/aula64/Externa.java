package com.bruna.cursojava.aula64;

public class Externa {

	private String texto = "texto externo";

	public class Interna {

		private String texto = "texto interno";

		public void imprimeTexto() {
			System.out.println(texto);

			// consegue ver membros da classe externa
			System.out.println(Externa.this.texto);
		}
	}

	public static void main(String[] args) {

		Externa externa = new Externa();
		Interna interna = externa.new Interna();//nesse caso só pode instanciar a classe interna depois de instanciar a externa

		interna.imprimeTexto();
		/*retorno
		 * texto interno
		 * texto externo
		 */
	}
	
	//classes internas são declaradas somente quando a gente quer utilizar aquela classe interna dentro da classe externa
	//exemplo: Hibernate/JPA (chave primária composta- composto por mais de uma coluna) - banco de dados
	//Swing(actions) - classes locais
	//collections (comparar objetos) - utiliza mais as classes anonimas
}
