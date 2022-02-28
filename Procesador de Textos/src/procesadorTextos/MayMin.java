package procesadorTextos;

import java.util.Scanner;

public class MayMin {
	static String cadena;
	public static void main(String[] args) {
		convertirMinusculas(cadena);

	}
	
	public static String convertirMinusculas (String cadena) {
		Scanner sc = new Scanner(System.in);
		String palabra="";
		String cadena2;
		System.out.println("Inserta el mensaje en mayusculas que quieres convertir a minusculas");
		cadena=sc.nextLine();
		
		cadena2=cadena.toLowerCase();
		
		System.out.println(cadena2);
		
		return cadena2;
		
	}

}
