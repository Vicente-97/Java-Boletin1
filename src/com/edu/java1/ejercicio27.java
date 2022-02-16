package com.edu.java1;

import java.util.Scanner;

/*27. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.*/
public class ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int sueldos=0;
		int mayorde1000=0;
		int suma=0;
		for (int i=0; i<10; i++) {
			System.out.println("Introduce un sueldo");
			sueldos=Integer.valueOf(sc.nextInt());
			suma+=sueldos;
			if (sueldos>1000) {
				mayorde1000+=1;
			}
		}
		System.out.println(mayorde1000+ " Este es el total de sueldos mayores de 1000 €");
		System.out.println(suma+ " Esta es la suma de todos los sueldos");
	}
	
}
