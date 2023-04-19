package tp3Paackage;

public class Tp3AClass {

	public static void main(String[] args) {
		String cadenaC = "este es un ejercicio emocionante";
	 char laLetra = 'e';
	 int repeticiones = ContadorLetra (cadenaC, laLetra); 
	 System.out.println ("La letra" + " "+ laLetra+ " " + "se repite:" + " " +repeticiones + " " + "veces");  
	

	} 
	private static int ContadorLetra (String cadenaC, char laLetra) { 
		int contador = 0; 
		for(int i = 0; i < cadenaC.length(); i++) { 
			if(laLetra == cadenaC.charAt(i)) { 
				contador++; 
				}
		}
		return contador;// tp3A
	}
	
	
	}
