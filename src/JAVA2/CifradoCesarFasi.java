package JAVA2;

public class CifradoCesarFasi {
	
	public static final String abecedario="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Cifraso_cesar_facil("HOLA", 2));
	}
 public static String Cifraso_cesar_facil(String cadena, int posicion) {
	 StringBuilder sc= new StringBuilder();
	 
	int desplazamiento=abecedario.indexOf(cadena);
	int longitud=abecedario.length();
	
	int nuevaPosicion= (posicion+ desplazamiento)%longitud;
	 
	sc.append(abecedario.charAt(nuevaPosicion));
	
	
	 return sc.toString();
 }
}
