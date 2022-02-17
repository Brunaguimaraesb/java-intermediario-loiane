package com.bruna.cursojava.aula75_84;

//string: concatenação
public class Aula76Concatenacao {
	
	public static void main(String[] args) {

		String curso = "Curso ";
		String java = "Java";

		String cursoJava = curso + java;// foi feito uma concatenação com duas strings

		System.out.println(cursoJava);//Curso Java

		String resultado2Com2 = "Resultado 2+2 = " + (2 + 2);//concatenação de uma string com expressões - com parenteses primeiro resolve a expressão numerica para depois transformar em string
		System.out.println(resultado2Com2);//4

		String resultado2Com2_ = "Resultado 2+2 = " + 2 + 2;//quando não colocamos parenteses em expressões numericas ele primeiro concatena a string com o primeiro numero transformando ele em string e depois concatena com o segundo
		System.out.println(resultado2Com2_);//22

		String um = String.valueOf(1);//podemos usar o valueOf transformando o numero em string
		System.out.println(um);//1
		//concatenando varias strings
		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing enim ad, "
				+ "morbi tristique senectus et netus et malesuada anim id fames ac irure "
				+ "consectetur lorem donec massa sapien faucibus et molestie ac feugiat "
				+ "in pellentesque massa placerat duis occaecat cupidatat ultricies lacus "
				+ "tristique et egestas quis ipsum suspendisse ultrices gravida dictum fusce "
				+ "nulla posuere sollicitudin aliquam ultrices sagittis orci a scelerisque.";
		   
		System.out.println(concatenacao);//o texto vai ser todo concatenado e vai retornar o texto inteiro
		
		//outra forma de fazer a mesma coisa do anterior
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing enim ad, ";
		concatenacao2 += "morbi tristique senectus et netus et malesuada anim id fames ac irure ";
		concatenacao2 += "consectetur lorem donec massa sapien faucibus et molestie ac feugiat ";
		concatenacao2 += "In pellentesque massa placerat duis occaecat cupidatat ultricies lacus ";
		concatenacao2 += "tristique et egestas quis ipsum suspendisse ultrices gravida dictum fusce ";
		concatenacao2 += "nulla posuere sollicitudin aliquam ultrices sagittis orci a scelerisque.";

		System.err.println(concatenacao2);

	}

}
