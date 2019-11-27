package es.studium.ContarVocales;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
		String cadena1;
		
		
		System.out.println("Escribe la cadena: ");
		cadena1=teclado.nextLine();
		
		System.out.print("El número de vocales es: "+funcionvocales(cadena1));
		teclado.close();
	}
 public static int funcionvocales(String a)
 {String cadena1=a;
	int counter=0;
	
	for(int i=0;i<cadena1.length();i++)
	{if((cadena1.charAt(i)=='a')||(cadena1.charAt(i)=='e')||(cadena1.charAt(i)=='i')||(cadena1.charAt(i)=='o')||(cadena1.charAt(i)=='u'))
	{counter++;
	}}
	return counter;

	}
}
