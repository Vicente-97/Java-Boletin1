package com.edu.java1;
/**
 * 
 * @author estudiante
 *
 */
public class Corregido42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (contraseña("esta"));
		System.out.println (contraseña("Hermenegildo.8"));
		System.out.println (contraseña("Hermenegildo"));
		
	}
	public static String contraseña(String contraseña) {
	String resultado="DEBIL";
	boolean existeMayuscula=false;
	boolean existeMinuscula=false;	
	boolean existeDigito=false;	
	boolean existeSimbolo=false;
	
	
	String Signo=".,;:'¡!'¡?¿@";
	
	
		if (contraseña.length()>=8){
			for (int i=0; i<contraseña.length(); i++) {
				if(Character.isUpperCase(contraseña.charAt(i))) {
					existeMayuscula=true;
				}else if (Character.isLowerCase(contraseña.charAt(i))) {
					existeMinuscula=true;
				}else if (Character.isDigit(contraseña.charAt(i))) {
					existeDigito=true;
				}else if (Character.isDigit(contraseña.charAt(i))) {
					
				}else if (Signo.indexOf(contraseña.charAt(i))!=-1) {
					existeSimbolo=true;
				}
			}
			if (existeMayuscula && existeMinuscula && existeDigito && existeSimbolo) {
				resultado="FUERTE";
			}
		}
	
	
	
		
		
		
		
		return resultado;
}
}
