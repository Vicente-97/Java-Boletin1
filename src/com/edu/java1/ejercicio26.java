package com.edu.java1;

import java.util.Scanner;

/*Crea un programa que permita sumar N números. El usuario decide cuándo termina de
introducir números al indicar la palabra ‘fin’*/
public class ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numeros=(Integer.valueOf(sc.next()));
		int suma=numeros;
		System.out.println("Quieres terminar, introduce (fin) para terminar, o (no) para seguir");
		String palabra= (sc1.next());
		
	
		while(!palabra.equals("fin")) {
			System.out.println("Introduce un numero");
			numeros=(Integer.valueOf(sc.next()));
			System.out.println("Introduce (fin) para terminar");
			palabra= (sc1.next());
			suma+=numeros;
			
		}
			System.out.println(suma+ " Esta es la suma de los numeros introducidos");	
		}
		
	}


