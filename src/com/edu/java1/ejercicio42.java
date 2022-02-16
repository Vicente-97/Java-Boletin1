package com.edu.java1;

/*/. Realizar un método que dada una cadena de entrada, comprueba si es una contraseña
FUERTE o DÉBIL. Se considera que una contraseña es fuerte si contiene 8 o más
caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo de
puntuación y un dígito.*/

/*if (contraseña.charAt(i)==Mayuscula.length() && contraseña.charAt(i)== Minuscula.length() && contraseña.charAt(i)== signoPuntuacion.length() && contraseña.charAt(i)==digito.length())*/
public class ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			contraseña("KJ8n!999999");
	}
	public static void contraseña (String contraseña) {
	String resultado="";
	String signoPuntuacion=".,!¿?¡@#";
	String digito="0123456789";
	String Mayuscula="QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Minuscula="qwertyuiopasdfghjklñzxcvbnm";
	/*Character.isUpperCase(i)==true && Character.isLowerCase(i)==true && signoPuntuacion.indexOf(i)!=1 && digito.indexOf(i)!=1*/
	
		if (contraseña.length()>8) {
			for (int i=0; i<contraseña.length();i++) {
				if ((Mayuscula.indexOf(i)!=-1) && (Minuscula.indexOf(i)!=-1) && (signoPuntuacion.indexOf(i)!=-1) && (digito.indexOf(i)!=-1)) {
				resultado="FUERTE";
			/*for(int i=0; i<contraseña.length(); i++) {
				if ((Mayuscula.indexOf(i)!=1) && (Minuscula.indexOf(i)!=1) && (signoPuntuacion.indexOf(i)!=1) && (digito.indexOf(i)!=1)) {
					resultado="fuerte";*/
			}else {
				resultado="DEBIL";
			
			}
			
			
		}	
		System.out.println(resultado);
}
	
}
		
}	


