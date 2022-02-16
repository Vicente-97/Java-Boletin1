package com.edu.java1;


/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144… El número n se debe introducir por teclado*/

public class ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci(7);
	}
	public static void Fibonacci(int numero) {
		int numeroInicial=0;
		int numeroactual=1;
		int acumulado;
		
		for(int i=1; i<=numero; i++) {
			if (i==1) {
				System.out.println(numeroInicial);
			}else {
				acumulado=numeroactual;
				System.out.println(numeroactual);
				numeroactual+=numeroInicial;
				numeroInicial=acumulado;
			}
		}
	}
}
