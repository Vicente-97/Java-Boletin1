package com.edu.java1;
import java.util.Scanner;

public class ejercicio19_boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Suma_15_numeros());
	}
	public static int Suma_15_numeros() {
		Scanner sc=new Scanner(System.in);
		int resultado=0;
		int contador=0;
		int numeros=0;
		while(contador<15) {
			System.out.println("Introduce los numeros");
			numeros=Integer.valueOf(sc.next());
			resultado+=numeros;
			contador+=1;
			
		}
		return resultado;	
	}
	
}