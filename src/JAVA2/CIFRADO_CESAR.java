package JAVA2;

public class CIFRADO_CESAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(CIFRASO_CESAR("ABCDE", 2));
	}
public static String CIFRASO_CESAR(String cadena, int posicion) {
	String Abecedario="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	StringBuilder sb = new StringBuilder();
	
	for(int i=0; i<cadena.length(); i++) {
		for (int j=0; j<Abecedario.length(); j++) {
		if (cadena.charAt(i)==Abecedario.charAt(j)) {
			sb.append(Abecedario.charAt(i+posicion));
			//sb.append(Abecedario.charAt(cadena.charAt(i)+posicion));//
		}
		
	
	
	
	
	
}
}
	return sb.toString();
}

}
