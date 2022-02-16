package com.edu.java1;

import java.util.Scanner;

/*Realiza un programa que vaya pidiendo números hasta que se introduzca un número
negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
datos pero no se incluye en el cómputo.*/
public class ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=Integer.valueOf(sc.nextInt());
		boolean pares= true;
		int contador=0;
		int contadorImpares=0;
		int numMayorPares=0;
		int sumaImpares=0;
		int media=0;
		
		while(numero >=0) {
			contador+=1;
			if (numero%2==0) {
				 pares=true;
				 System.out.println("Es un numero par");
				 if (numero>numMayorPares) {
					 numMayorPares=numero;
				 }
				 System.out.println("Introduce un numero");
				 numero=Integer.valueOf(sc.nextInt());
				 
			}else if (numero%2!=0) {
				contadorImpares+=1;
				pares=false;
				System.out.println("No es un numero par, por lo tanto este numero es IMPAR");
				sumaImpares+=numero;
				media=sumaImpares/contadorImpares;
				System.out.println("Introduce un numero");
				numero=Integer.valueOf(sc.nextInt());
			}
		}	
		System.out.println("los numeros introducidos son un total de, "+ contador);
		System.out.println("El mayor de los numeros pares es el siguiente numero, "+ numMayorPares);
		System.out.println("La media de los numeros impares es. "+ media);
	}

}
