package com.bruna.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

//ResourceBundle
public class Aula95ResourceBundle {

	public static void main(String[] args) {

		System.out.println("Locale atual " + Locale.getDefault());//Locale atual pt_BR - ver qual locale esta sendo no computador
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");//o java tem uma logica para ler arquivo de recursos

		System.out.println("Hello EN: " + rb.getString("hello"));//Hello EN: Hello  World EN: World - para pegar a mensagem passamos a chave hello
		System.out.println("World EN: " + rb.getString("world"));//Olá pt_BR: Olá Mundo  Mundo pt_BR: Mundo 2 - para pegar o valor passamos a chave world

		// Locale.setDefault(new Locale("pt_BR", "pt_BR")); //determina que vai ser esse a linguagem como padrão
		rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR"));

		System.out.println("Olá pt_BR: " + rb.getString("hello"));
		System.out.println("Mundo pt_BR: " + rb.getString("world"));
	}

}
