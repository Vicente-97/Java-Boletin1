package com.edu.java1;


/*Realiza un método que reciba una hora por parámetro y que muestre luego buenos días,
buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y
de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas*/

public class Ejercicio5_boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hora_del_Dia("22:45"));
	}
	public static String Hora_del_Dia (String momento) {
		String cadenaFinal="";
		
		int hora = Integer.parseInt(momento.substring(0, momento.indexOf(":")));
		if (hora>=6 && hora<=12){
			cadenaFinal="Buenos Días";
			
		}else if (hora>12 && hora<=20) {
			cadenaFinal="Buenas Tardes";
		}else {
			cadenaFinal="Buenas noches";
		}
		
		
	return cadenaFinal;
	}
}
