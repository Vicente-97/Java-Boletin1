package com.edu.java1;

import java.util.Scanner;

public class Ejercicio_4_Boletin1 {

	
	public static void main(String[] args) {
		
		System.out.println(calificaciones(8,7,8));
	}



	public static String calificaciones(double notaTeorica, double notaProblemas, double notaPractico) {
	
			String cadena="";
			double notaFinal=0;
			
			notaTeorica= notaTeorica*0.10;
			notaProblemas= notaProblemas*0.50;
			notaPractico=notaPractico *0.40;
			notaFinal= notaTeorica+notaProblemas+notaPractico;
			
			 
			if (notaTeorica <=10 && notaTeorica>=0 && notaProblemas <=10 && notaProblemas>=0 && notaPractico <=10 && notaPractico>=0){
				
			if (notaFinal>=5 && notaFinal <6){
				cadena="Tu nota es Suficiente";
			}else if (notaFinal >=6 && notaFinal<7) {
				cadena="Tu nota es bien";
			}else if (notaFinal >=0 && notaFinal<5) {
				cadena="Tu nota es insuficiente";
						
			}else if (notaFinal >=7 && notaFinal<9) {
				cadena="Tu nota es notable";
						
			}else if (notaFinal >=9 && notaFinal<=10) {
				cadena="Tu nota es sobresaliente";
						
		}
			}
			else {
				cadena="error";
			}
				
				
		
		return cadena;
	}
		
	}
