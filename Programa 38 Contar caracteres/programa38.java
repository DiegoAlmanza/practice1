//Nombre: Diego Almanza Beyless
//Dia: 23/02/2019
//Hora: 01:32

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada
 
class programa38{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Objeto para poder ingresar datos desde el teclado y poder almacenarlos.
		
	System.out.print("Ingrese una cadena: ");
	String S=sc.nextLine();

	char[] ch= S.toCharArray();//Guardamos la cadena en un arreglo.
	//declaramos las variables.
	int letras= 0;
	int espacios= 0;
	int numeros=0;
	int otros=0;

	for(int i=0; i<S.length();i++){//length cuenta los caracteres de la cadena
		if(Character.isLetter(ch[i])){//Si el caracter es una letra aumentamos el valor letras.
			letras++;
		}
		else if(Character.isSpaceChar(ch[i])){//si el caracter es un espacio aumentamos el valor de espacios.
			espacios++;
		}
		else if(Character.isDigit(ch[i])){//si el caracter es un numero aumentamos el valor de numeros.
			numeros++;
		}
		else{
			otros++;//si no es ninguno aumentamos el valor de otros.
		}
			
	}
	//Mostramos los resultados.
	System.out.print("\n"+S);
	System.out.print("\nTiene "+letras+" letras");
	System.out.print("\nTiene "+espacios+" espacios ");
	System.out.print("\nTiene "+numeros+" numeros");
	System.out.print("\nTiene "+otros+" diferentes");	
	
}
}
