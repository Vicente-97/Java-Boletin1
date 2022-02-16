package com.edu.java1;



public class Ejercicio3_boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(QueCaracterEs('V'));
	}
	
	public static String QueCaracterEs(char c){
		String signoDePuntuacion=".,;:!¿¡?";
		String mensaje="Error";
		String Espacio = " ";
		String ParentesisLLaves="[]{}";
		
		
		
		if (Character.isUpperCase(c)){	
			mensaje="Letra Mayúscula";	
		}else if (Character.isLowerCase(c)){
			mensaje="Es una letra Minuscula";
		}else if (Character.isDigit(c)) {
			mensaje="Es un Digito";
		}else if (signoDePuntuacion.indexOf(c)!=-1){
			mensaje="Es un signo de puntuación";
		}else if (Espacio.indexOf(c)!=-1) {
			mensaje="Es un espacio es blanco";
		}else if (ParentesisLLaves.indexOf(c)!=-1) {
			mensaje="Es un parentesis o una llave";		
		}else {
			mensaje="Es Otro Caracter";
		}
			
			
			
			
	
			
		return mensaje;
		
		
	}

}
