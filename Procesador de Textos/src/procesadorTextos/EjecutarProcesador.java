package procesadorTextos;

import java.util.Scanner;

public class EjecutarProcesador {
	static Scanner sc = new Scanner(System.in);
	static String mayusculas;
	static String espacios;
	static String tildes;
	static String acortarEspacios;
	static int opcion;
	static boolean salida=true;
	static int opcion2;
	
	public static void main(String[] args) {
		while(salida==true) {
			System.out.println("Pulse 1 para cambiar de MAYUSCULAS A MINUSCULAS");
			System.out.println("Pulse 2 para cambiar los espacios por puntos y comas");
			System.out.println("Pulse 3 para quitar las tildes");
			System.out.println("Pulse 4 para regular los espacios");
			
			opcion=Integer.parseInt(sc.nextLine());
			
			if(opcion==1) {
				convertirMinusculas(mayusculas);
			}
			
			
			if(opcion==2) {
				cambioEspacios(espacios);
			}

			if(opcion==3) {
				quitarTildes(tildes);
			}

			if(opcion==4) {
				acortarEspacios(acortarEspacios);
			}
			
			System.out.println("¿Quieres modificar más textos? 1.SI || 2.NO");
			opcion2=Integer.parseInt(sc.nextLine());
			
			if(opcion2==1) {
				salida=true;
			}
			
			if(opcion2==2) {
				salida=false;
			}
		}
		

	}
	
	//metodo para convertir de mayusculas a minusculas
	public static String convertirMinusculas (String mayusculas) {
		//Scanner sc = new Scanner(System.in);
		String palabra="";
		String texto="";
		String textoFinal;
		System.out.println("Inserta el mensaje en mayusculas que quieres convertir a minusculas");
		texto=sc.nextLine();
		
		//con el metodo toLowerCase, convierto a minusculas todo el texto al que se lo aplique
		textoFinal=texto.toLowerCase();
		
		System.out.println(textoFinal);
		
		return mayusculas;
	}
	
	//metodo para cambiar los espacios por puntos y comas
	public static String cambioEspacios(String espacios) {
		
		//Scanner sc = new Scanner(System.in);
		String texto="";
		String textoFinal;
		System.out.println("Inserta el texto a modificar");
		texto=sc.nextLine();
		
		//con el metodo replace, entre parentesis, le indico lo que quiero que me modifique, y que quiero que me ponga, separado por una coma
		textoFinal=texto.replace(" ", ";");
		
		System.out.println(textoFinal);
		
		
		return espacios;
	}
	
	//metodo para quitar las tildes
		public static String quitarTildes(String tildes) {
			//Scanner sc = new Scanner (System.in);
			String texto;
			String textoFinal="";
			System.out.println("Inserte el texto que desea modificar");
			texto=sc.nextLine();
			
			
			//creo un array donde voy a guardar los caracteres del texto
			char [] cadena = new char [1000];
			
			//con el metodo .toCharArray separo la cadena por caracteres y se lo aplico a cada posicion del array
			cadena = texto.toCharArray();
			
			//bucle for para recorrer el array 
			for(int i =0; i<cadena.length;i++) {
				//en los if, identifico el caracter con tilde y lo cambio por el mismo caracter pero sin tilde
				if(cadena[i]=='á') {
					cadena[i]='a';
				}
				if(cadena[i]=='é') {
					cadena[i]='e';
				}
				if(cadena[i]=='í') {
					cadena[i]='i';
				}
				if(cadena[i]=='ó') {
					cadena[i]='o';
				}
				if(cadena[i]=='ú') {
					cadena[i]='u';
				}
				if(cadena[i]=='Á') {
					cadena[i]='A';
				}
				if(cadena[i]=='É') {
					cadena[i]='E';
				}
				if(cadena[i]=='Í') {
					cadena[i]='I';
				}
				if(cadena[i]=='Ó') {
					cadena[i]='O';
				}
				if(cadena[i]=='Ú') {
					cadena[i]='U';
				}
				
				textoFinal=textoFinal+(char)(cadena[i]);
				
			}
			System.out.println(textoFinal);
			//reseteo la cadena
			textoFinal="";
			
			
			return tildes;
		}
		
		
	//metodo para suprimir mas de dos espacios seguidos por un espacio
		public static String acortarEspacios(String acortarEspacios) {
			//Scanner sc = new Scanner(System.in);
			String texto="";
			String textoFinal="";
			System.out.println("Inserta el texto que quieres modificar");
			texto=sc.nextLine();
			
			//con el metodo replaceAll le indico con el parentesis y el + que cuando haya mas de un espacio seguido sean cambiados por uno solo
			textoFinal= texto.replaceAll("( )+" , " ");

			System.out.println(textoFinal);
			
			
			return acortarEspacios;
		}

}

