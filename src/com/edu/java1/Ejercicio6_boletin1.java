package com.edu.java1;

/*Programar un sistema de calefacción-refrigeración que compruebe en función del día y el
mes la estación en la que estamos y en función de la estación programe la temperatura:
Invierno->19º, Primavera->20º, Verano->24º, Otoño→19º. El método deberá recibir como
parámetro el mes y el día actual, y el método deberá devolver los grados a los que
deberemos programar el sistema*/
public class Ejercicio6_boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(temperatura(3,20));
	}
	public static String temperatura (int mes, int dia) {
		 String temperatura="";
		 
		 if ((dia >=20 && mes==3)|| (dia<21 && mes==6) || (mes==3) ||(mes==4)) {
			 temperatura="Estamos en primavera y la temperatura es de 20º";
		 }else if ((dia >=21 && mes==12)|| (dia<20 && mes==3) || (mes==2)|| (mes==1)) {
			 temperatura="Estamos en Invierno y la temperatura es de 19º";
		 }else if ((dia >=21 && mes==6)|| (dia<=23 && mes==9) || (mes==7)|| (mes==8)) {
			 temperatura="Estamos en Verano y la temperatura es de 24º";
		 }else {
			 temperatura="Estamos en Otoño y la temperatura es de 19º";
		 }
		 
		 
		 
	return temperatura;

}
}
