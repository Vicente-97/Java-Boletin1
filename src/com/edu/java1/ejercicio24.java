package com.edu.java1;

import java.util.Scanner;

/*Programa que reciba 10 números y nos indique cuál de ellos es el máximo (el mayor)*/
public class ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un numero");
		int numeros=(Integer.valueOf(sc.next()));
		int NumMayor=0;

	for (int i=1; i<10; i++) {
		if (numeros >NumMayor) {
			NumMayor=numeros;
			System.out.println("Introduzca otro numero");
			numeros=(Integer.valueOf(sc.next()));
		}else {
			System.out.println("Introduzca otro numero");
			numeros=(Integer.valueOf(sc.next()));
			}
		
	}
		System.out.println(NumMayor+ " Es el numero mayor");
	}
}



