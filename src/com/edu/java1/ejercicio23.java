package com.edu.java1;

import java.util.Scanner;

/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han
introducido.*/

public class ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in);
	System.out.println("Introduce un numero");
	int resultado=0;
	int numero=Integer.valueOf(sc.next());
	int contador=0;
	while (numero>=0) {
		System.out.println(numero);
		numero=0;
		contador+=1;
		System.out.println("Introduce un numero");
		numero=Integer.valueOf(sc.next());
	}System.out.println("se mostraron un total de, "+ contador+ " numeros");

}
}