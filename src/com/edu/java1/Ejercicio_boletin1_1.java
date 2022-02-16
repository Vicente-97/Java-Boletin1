package com.edu.java1;

import java.util.Scanner;

public class Ejercicio_boletin1_1 {

	public static void main(String[] args) {
		Multiplo();

	}
	
	public static void Multiplo() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		System.out.println("Dime un segundo numero");
		int numero= Integer.valueOf(sc.nextInt());
		int numero2= Integer.valueOf(sc.nextInt());
		sc.close();

		
	
		
	
		if (numero%numero2==0 || numero2%numero==0) {
			System.out.println("Son multiplos");
		}
		else {
			System.out.println("No son multiplos");
		}
	}
	}



