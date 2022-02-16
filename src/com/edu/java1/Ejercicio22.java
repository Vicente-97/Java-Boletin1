package com.edu.java1;

import java.util.Scanner;

/*. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo*/
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int resultado=1;
		int numero=sc.nextInt();
		while (numero!=0){
			resultado=numero*numero;
			System.out.println("El cuadrado de su numero es, "+ resultado);
			System.out.println("Introduzca el numero para obtener su cuadrado");
			numero=sc.nextInt();
		}	
	}
}

