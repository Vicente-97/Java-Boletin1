package com.edu.java1;
/*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle
while*/
public class ejercicio17_boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		del_320_al_160_while(160);
	}
	public static void del_320_al_160_while(int numero) {
		int i=320;
	
		while (i>=numero) {
			System.out.println(i);
			i-=20;
		
		}
		

}
}
