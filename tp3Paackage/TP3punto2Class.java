package tp3Paackage;

public class TP3punto2Class {

	public static void main(String[] args) {
			
			String cadena = "Debora;Fabiana;Micaela;Nadya;Cynthia;Alfredo;Kuky;Matilda;Ramona;Morena";

			String lista[] = cadena.split(";");             

			for (String separar : lista) {
				
			System.out.println ("Nombre: " +separar);
			}
			
		}
			
	}

	


