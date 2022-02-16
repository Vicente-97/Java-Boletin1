package com.edu.java1;
/*. Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).*/
public class ejercicio21_boletin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Suma_100_numeros(1));
	}
		public static int Suma_100_numeros(int numero){
		int suma=0;
		if (numero >0){
			for (int i=numero; i<=(numero+100); i++) {
				suma+=i;
				
			}
		}else {
			System.out.println("El numero introducido es incorrecto.");
		}
		
		
		
		
		
		return suma;
	}
}
