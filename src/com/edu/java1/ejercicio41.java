package com.edu.java1;

import java.util.Scanner;

/*Realiza un programa que pida un número por teclado y que luego muestre ese número al
revés. Utilizar cadenas para facilitar la tarea*/



public class ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero");
		String numero=(sc.next());
		String cadenaInvertida="";
		if (numero!="0") {
			for(int i=numero.length()-1; i>=0; i--){
				cadenaInvertida+=numero.charAt(i);
				
			}
		}
		
		
		System.out.println(cadenaInvertida);
		
	}

}
