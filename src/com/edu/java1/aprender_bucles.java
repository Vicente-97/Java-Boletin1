package com.edu.java1;

import java.util.Scanner;

public class aprender_bucles {

	
	public static void main (String[] args) {
		/*for--> 1(declaracion y definición de contador);
		 * 2: condicion
		 * 3 actualizacion del contador
		 
		 */
		
		
		for (int i =1; i <=10; i++) {
			System.out.println(i*2);
		}
		//--------------para bucles while----------//
		int j=1;
		
		while (j<=10) {
			System.out.println(j*2);
			j++;
		}
		/*
		 * Control por condicion
		 */
		Scanner scanner =new Scanner (System.in);
		int numero = 0;
		
		while(numero>0) {
			System.out.println("Introduzca un número");
			numero= Integer.valueOf(scanner.next());
			if (numero%2==0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("el numero es impar");
			}
		}
		//-------------dowhile---///
		
		int numero_1 = 0;
		
		do {
			System.out.println("Introduzca un número");
			numero= Integer.valueOf(scanner.next());
			if (numero%2==0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("el numero es impar");
			}
		}while(numero>0);
		
		//-------------Bucles for con condicion para que no entre mas al bucle------------//
		
		boolean esPrimo = true;
		int numero_2 = 153;
		
		
		for (int i=2 ; i< numero_2 && esPrimo; i++) {
			if (numero % i==0) {
				esPrimo= false ;
				
				
			}
		}
	}
}
