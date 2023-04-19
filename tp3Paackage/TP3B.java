package tp3Paackage;

public class TP3B {

	public static void main(String[] args) {
			int[]enOrden = OrdenarNumeros(15, 47, 38, "a");
				
			for(int i = 0; i < enOrden.length; i++) {
				System.out.println(enOrden[i]);
				}
			}
			
			private static int[] OrdenarNumeros(int num1, int num2, int num3, String orden) {
				int[] numOrdenados = new int[3];
				numOrdenados[0] = num1;
				numOrdenados[1] = num2;
				numOrdenados[2] = num3;
				
				if(orden == "des") {
					for(int i = 0; i < numOrdenados.length ; i++) {
						for(int j = i + 1; j < numOrdenados.length ; j++) {
							if(numOrdenados[i] < numOrdenados[j]) {
								int auxiliar = numOrdenados[i];
								numOrdenados[i] = numOrdenados[j];
								numOrdenados[j] = auxiliar;
							}
						}
					}
				}
			if(orden == "asc") {
				for(int i = 0; i < numOrdenados.length ; i++) {
					for(int j = i + 1; j < numOrdenados.length ; j++) {
						if(numOrdenados[i] > numOrdenados[j]) {
							int auxiliar = numOrdenados[i];
							numOrdenados[i] = numOrdenados[j];
							numOrdenados[j] = auxiliar;
							}
						}
					}
				}
				return numOrdenados; //TP3B
		}
		

	}


			
		