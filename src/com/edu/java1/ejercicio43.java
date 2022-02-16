package com.edu.java1;

/*Elabora un programa que codifique una cadena, de tal modo que en el resultado se inviertan
cada 2 caracteres. Los caracteres intercambiados no pueden volver a intercambiarse.
Ejemplo:
Entrada -> Hola mundo
Salida -> oHalm nuod*/


public class ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CadenaInvertida_2("Hola mundo"));
	}
	public static String CadenaInvertida_2(String cadena) {
		String CadenaFinal="";
		
		for (int i=1; i<cadena.length(); i+=2) {
			CadenaFinal=CadenaFinal+cadena.charAt(i)+cadena.charAt(i-1);
		}
		
		if (cadena.length()%2!=0) {
			CadenaFinal+= cadena.substring(cadena.length()-1, cadena.length());
		}
		
		return CadenaFinal;
	}
}
