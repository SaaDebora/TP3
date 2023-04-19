package tp3Paackage;

public class Tp3Cclass {

	public static void main(String[] args) {		
			int vector1[]= {35,15,45};
			int num1=60;
			int suma=0;
			
			for( int i=0; i<vector1.length ; i++) {
				if (num1> vector1[i]) {
					suma=suma + vector1[i];
				}
				
				}
			System.out.println (suma); 
		}
	}	


