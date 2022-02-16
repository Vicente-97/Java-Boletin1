package com.edu.java1;

import java.util.Scanner;

public class Ejercicio1_Inicial {

	public static void main (String [] args) {
		
		System.out.println("Indique su edad");
		
		int edad;
		Scanner sc =new Scanner (System.in);
		
		edad= sc.nextInt();
	// ejercicio 1 y 2 , edad si es mayor de 18 //	
		
		if (edad<18) {
			System.out.println("Es un niño");
		}else if (edad>=18 && edad<65) {
			System.out.println("Adulto");
			System.out.println("Es mayor de edad");
			
		}else if (edad>65) {
			System.out.println("usted es un anciano");
			System.out.println("Es mayor de edad");
		}
		
		//-------------para bucles while------------//
		
		int i=1;
		
		while (i<=50) {
			System.out.println(i*2);
			i++;
		}
		//
	}
}
