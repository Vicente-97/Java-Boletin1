package com.edu.java1;

import java.util.Scanner;

public class Ejercicio2_Boletin1 {

	public static void main(String[] args) {
		
		Asignatura();
	}
	
	public static void Asignatura() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Qué día de la semana es? 1=Lunes, 2=Martes, 3=Miercoles, 4=Jueves, 5=Viernes");
		int dia= Integer.valueOf(sc.nextInt());
		sc.close();
		
		if (dia==1) {
			System.out.println("La primera asignatura del día es Sistemas");
		}else if (dia==2) {
			System.out.println("La primera asignatura del día es Programación");
		}else if (dia==3) {
			System.out.println("La primera asignatura del día es Base de datos");
		}else if (dia==4) {
			System.out.println("La primera asignatura del día es Programación");
		}else if (dia==5) {
			System.out.println("La primera asignatura del día es Sistemas");
		}else {
			System.out.println("Es fin de semana, no hay clases");
		}
		
	}

}
