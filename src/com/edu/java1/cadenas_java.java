package com.edu.java1;

public class cadenas_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadenaDeTexto="Nueva cadena de texto";
		
		cadenaDeTexto=new String("Ahora");
		
		
		//-------1. Esta Vacia
		
		cadenaDeTexto.isEmpty();//omprueba que la cadena de texto está vacía		
		
		//-2 longitud de la cadena
		
		cadenaDeTexto.length();//Longitud de la cadena
		
		
		//3--- porisicon de la cadena
		
		System.out.println(cadenaDeTexto.indexOf('o'));
		System.out.println(cadenaDeTexto);
		cadenaDeTexto= cadenaDeTexto.toLowerCase();
	}

}
