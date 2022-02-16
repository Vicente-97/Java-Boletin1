package com.edu.java1;

import java.util.Scanner;


public class Ejercicio2 {
	
	public static void main (String [] args) {
		NumeroDiasMes();
	}
		
		
		public static void NumeroDiasMes() {
		
		//Introduce un año//
	
		System.out.println("indica un año");
		int ano;
		boolean bisiesto=true;
		Scanner sc= new Scanner (System.in);
		
		ano=sc.nextInt();
		
		
		if ((ano%4==0) && ((ano%100!=0) || (ano%400==0))) {
			
		bisiesto= true;
		System.out.println("Es un año bisiesto");
		}else {
			bisiesto=false;
			System.out.println("No es bisiesto");
		}
		
		int mes;
		System.out.println("Indica un mes del año");
		mes=sc.nextInt();
		
		if (mes==1) {
			System.out.println("Su mes es Enero y cuenta con 31 días");
		}
		else if (mes==2 && bisiesto==true) {
			System.out.println("Su mes es febrero y tiene 29 días");
		}else if (mes==2 && bisiesto==false) {
			System.out.println("Su mes es febrero y tiene 28 días");
		}else if (mes==3) {
			System.out.println("Su mes es Marzo y tiene 31 días");
		}else if (mes==4) {
			System.out.println("Su mes es Abril y tiene 30 días");
		}else if (mes==5) {
			System.out.println("Su mes es Mayo y tiene 31 días");
		}else if (mes==6) {
			System.out.println("Su mes es Junio y tiene 30 días");
		}else if (mes==7) {
			System.out.println("Su mes es Julio y tiene 31 días");
		}else if (mes==8) {
			System.out.println("Su mes es Agosto y tiene 31 días");
		}else if (mes==9) {
			System.out.println("Su mes es Septiembre y tiene 30 días");
		}else if (mes==10) {
			System.out.println("Su mes es Octubre y tiene 31 días");
		}else if (mes==11) {
			System.out.println("Su mes es Noviembre y tiene 30 días");
		}else if (mes==12) {
			System.out.println("Su mes es Diciembre y tiene 31 días");
		}else {
			System.out.println("Ese mes no existe");
		}
		
}
}


