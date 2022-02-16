package Examen_01_java;


public class EJERCICIO1 {

	public static final int PRECIO_ENTRADA =8;
	public static final int PRECIO_DIA_ESPECTADOR=5;
	public static final int PRECIO_PAREJA =11;
	public static final double PORCENTAJE_DESCUENTO =0.90;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(CalcularPrecio(4, 5, false));
	
	}
	public static double CalcularPrecio(int dia, int persona, boolean tarjetacine) {
		double precioTotal=0;
		
		if ("X".equals(dia)) {
			precioTotal=persona*PRECIO_DIA_ESPECTADOR;
		}else if ("J".equals(dia)) {
			precioTotal=persona*PRECIO_DIA_ESPECTADOR;
		}
		
		
		
		return precioTotal;
	}
}
