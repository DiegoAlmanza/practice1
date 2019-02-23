//Nombre: Diego Almanza Beyless
//Dia: 23/02/2019
//Hora: 01:11

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada
import java.lang.Math;//Ultiliamos la calse .Math para realiar calculos matematicos comunes.
 
class programa37{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Objeto para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese una cadena: ");//Pedimos que ingrese la cadena.
	char[] letras= sc.nextLine().toCharArray();//copia los caracteres de la cadena a una matri de caracteres.

	System.out.print("Cadena al reves: ");
		for(int i=letras.length-1;i>=0;i--){//.legth representa la longrud de la cadena.

			System.out.print(letras[i]);//muestra la cadena al reves sacando los caracteres del arreglo.
	}	

}
}