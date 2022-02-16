package com.edu.java1;

import java.util.Scanner;

public class HolaMundoApp {

	public static void main(String[] args) {
	
		int entero=1_000_000;
		float tipofloat= 0.9f;
		boolean variablebooleana =false;
		byte variablebyte= 1;
		char variablechar= 'l';
		int valor = 9;
		System.out.println(valor);

		//-----------------------------------------------//
		
		String name;
		System.out.println("¿Como te llamas?");
		
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
		System.out.println("Hello, "+name);
		
		//------------------------------------------------//
		
		int edad;
		System.out.println("¿Qué edad tienes");
		
		edad= sc.nextInt();
		
		System.out.println("Hello, Tu edad es, "+ edad);
		
		//-----------------------------------------------//
		String Apellido;
		System.out.println("¿Cual es tu apellido?");
		
		Apellido= sc.next();
		
		System.out.println("Tu apellido es , "+ Apellido);
		
		//-------------------------------------------------//
		
		String estacion;
		System.out.println("¿En que estación nos encontramos?");
		
		estacion= sc.next();
		
		System.out.println("Nos encontramos en la estacion de , "+ estacion);
		
		//-------------------------------------------------------//
		
		float NumeroDecimal;
		
		System.out.println("Indica un numero con decimales");
		
		NumeroDecimal=sc.nextFloat();
		
		System.out.println("Tu numero decimal es ,"+ NumeroDecimal);
		
		//--------------------------------------------------//
		
		valor++;
		

		System.out.println(entero);
		System.out.println(tipofloat);
		System.out.println(variablebooleana);
		System.out.println(variablebyte);
		System.out.println(variablechar);
		System.out.println(valor);
		
		;
		//------------------------------------------------------------//
		
		//Condicionales//
		
		boolean abierto = true;
		
		
		if (abierto) {
			System.out.println("Puede pasar");
		}else {
			System.out.println("En otra ocasión");
		}
		//--------------segunda estructura de condicionales------//
		int dia;
		System.out.println("¿Qué dia es hoy?");
		
		Scanner scanner= new Scanner(System.in);
		dia= scanner.nextInt();
		
		if (dia==1) {
			 System.out.println("Lunes");
		}else if (dia==2) {
			System.out.println("Martes");
		
		}else if (dia==3) {
			System.out.println("Miercoles");
		
		}else if (dia==4) {
			System.out.println("Jueves");
		
		}else if (dia==5) {
			System.out.println("Viernes");
		
		}else if (dia==6) {
			System.out.println("Sabado");
		
		}else if (dia==7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("El día no es valido");
	}
 //---------------------condicionales switch---------//
		
		switch (dia) {
		case 1:{
			
			System.out.println("Lunes");
			
			break;
		}
		case 2: {
			System.out.println("Martes");
		
			break;
		}case 3: {
			System.out.println("Miercoles");
		
			break;
		}case 4: {
			System.out.println("Jueves");
		
			break;
		}case 5: {
			System.out.println("Viernes");
		
			break;
		}case 6: {
			System.out.println("Sabado");
		
			break;
		}case 7: {
			System.out.println("Domingo");
		}default:
			System.out.println("Dia no valido");
		
			break;
		}
		//---------------------------//
		
		
		switch (dia) {
		case 1: {
			System.out.println("Lunes");
		}
		case 2: {
			System.out.println("Martes");
		}
		case 3: {
			System.out.println("miercoles");
		}
		case 4: {
			System.out.println("jueves");
		}
		case 5: {
			System.out.println("Viernes");
		}
		case 6: {
			System.out.println("sabado");
		}
		case 7: {
			System.out.println("domingo");
		
		}
		
}
}
}


