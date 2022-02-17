package com.bruna.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

//Locale (internacionalização)
public class Aula90Locale {

	public static void main(String[] args) {
		//diferentes formatações de acordo com a localidade
		/* Brasil-pt_BR
		 * data: dd/MM/yyyy
		 * numero: 1.000,02
		 */
		/* EUA-en_US
		 * data: MM/dd/yyyy
		 * numero: 1,000.02
		 */

		Locale locale = Locale.getDefault();//pega o padrão
		System.out.println(locale);// padrão pt_BR

		// podemos ver no java informações sobre os locais de internacionalização disponiveis na API
		Locale[] locales = Locale.getAvailableLocales();//obtem os locales disponiveis
		for (Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());//nome do locale
			System.out.println("Código da língua: " + loc.getLanguage());//codigo da lingua
			System.out.println("Língua: " + loc.getDisplayLanguage());//nome da lingua
			System.out.println("Código País: " + loc.getDisplayCountry());//código do pais
			
			System.out.println("*********************************");
		}

		// No Brasil precisa usar o new Locale ("pt","BR") , e irá mostrar o símbolo de
		// real
		Locale br = new Locale("pt", "Brazil");//passando a lingua e o pais
		
		System.out.println(br);//imprime o codigo da lingua e o pais

		Locale.setDefault(br);//seta o locale como o padrão do sistema

		System.out.println(Locale.getDefault());//pega o locale e tem como saida a lingua definida no sistema

		NumberFormat nf = NumberFormat.getCurrencyInstance();//pega qualquer instancia
		System.out.println(nf.format(50000000000000d));//formata o numero de acordo com o que foi determinado
				
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);//apresenta em dolar o numero
		System.out.println(nf1.format(50000000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);//apresenta em euro
		System.out.println(nf2.format(50000000000000d));
		

	}

}
