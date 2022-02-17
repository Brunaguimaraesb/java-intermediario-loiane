package com.bruna.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

//Locale (internacionaliza��o)
public class Aula90Locale {

	public static void main(String[] args) {
		//diferentes formata��es de acordo com a localidade
		/* Brasil-pt_BR
		 * data: dd/MM/yyyy
		 * numero: 1.000,02
		 */
		/* EUA-en_US
		 * data: MM/dd/yyyy
		 * numero: 1,000.02
		 */

		Locale locale = Locale.getDefault();//pega o padr�o
		System.out.println(locale);// padr�o pt_BR

		// podemos ver no java informa��es sobre os locais de internacionaliza��o disponiveis na API
		Locale[] locales = Locale.getAvailableLocales();//obtem os locales disponiveis
		for (Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());//nome do locale
			System.out.println("C�digo da l�ngua: " + loc.getLanguage());//codigo da lingua
			System.out.println("L�ngua: " + loc.getDisplayLanguage());//nome da lingua
			System.out.println("C�digo Pa�s: " + loc.getDisplayCountry());//c�digo do pais
			
			System.out.println("*********************************");
		}

		// No Brasil precisa usar o new Locale ("pt","BR") , e ir� mostrar o s�mbolo de
		// real
		Locale br = new Locale("pt", "Brazil");//passando a lingua e o pais
		
		System.out.println(br);//imprime o codigo da lingua e o pais

		Locale.setDefault(br);//seta o locale como o padr�o do sistema

		System.out.println(Locale.getDefault());//pega o locale e tem como saida a lingua definida no sistema

		NumberFormat nf = NumberFormat.getCurrencyInstance();//pega qualquer instancia
		System.out.println(nf.format(50000000000000d));//formata o numero de acordo com o que foi determinado
				
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);//apresenta em dolar o numero
		System.out.println(nf1.format(50000000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);//apresenta em euro
		System.out.println(nf2.format(50000000000000d));
		

	}

}
