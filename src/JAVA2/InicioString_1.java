package JAVA2;

public class InicioString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ObtenerCaracteres_Pares("Hola, Mundo", false));
	}
public static String ObtenerCaracteres_Pares(String cadena, boolean Par) {
	
	
	
	StringBuilder sb = new StringBuilder();
	
		for (int i=(Par ? 0: 1); i<cadena.length(); i+=2) {
			
			
			sb.append(cadena.charAt(i));
			
		}
		return sb.toString();
		
				
	}
	
	
}

