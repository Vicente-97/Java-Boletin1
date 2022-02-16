package com.edu.java1;

import java.util.Scanner;

public class ejercicio20_boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Multiplos_3());
	}
	public static String Multiplos_3() {
		
		Scanner sc=new Scanner(System.in);
		String resultado="";
		int contador =0;
		int numeros=0;
		while (contador<5) {
			System.out.println("Introduzca los numeros");
			numeros=Integer.valueOf(sc.next());
			contador +=1;
			if (numeros%3==0) {
				resultado+=numeros;
				resultado+=", Es multiplo de 3, ";
			}
		}
		
		return resultado;
		
	}
}
