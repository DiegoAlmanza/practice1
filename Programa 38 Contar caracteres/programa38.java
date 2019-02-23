//Nombre: Diego Almanza Beyless
//Dia: 23/02/2019
//Hora: 01:32

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada
 
class programa38{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Objeto para poder ingresar datos desde el teclado y poder almacenarlos.
		
	System.out.print("Ingrese una cadena: ");
	String S=sc.nextLine();

	char[] ch= S.toCharArray();
	int letras= 0;
	int espacios= 0;
	int numeros=0;
	int otros=0;

	for(int i=0; i<S.length();i++){
		if(Character.isLetter(ch[i])){
			letras++;
		}
		else if(Character.isSpaceChar(ch[i])){
			espacios++;
		}
		else if(Character.isDigit(ch[i])){
			numeros++;
		}
		else{
			otros++;
		}
			
	}

	System.out.print("\n"+S);
	System.out.print("\nTiene "+letras+" letras");
	System.out.print("\nTiene "+espacios+" espacios ");
	System.out.print("\nTiene "+numeros+" numeros");
	System.out.print("\nTiene "+otros+" diferentes");	
	
}
}