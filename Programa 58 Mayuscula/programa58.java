//Nombre: Diego Almanza Beyless
//Dia: 27/02/2019
//Hora: 22:26

import java.util.Scanner;//La clase Scanner permite leer valoers de entrada

class programa58{
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);//Se crea el objeto sc para poder almacenar datos

	System.out.print("Ingrese una Cadena: ");
	String line= sc.nextLine();//almacena la cadena en line.

	String newline="";
	Scanner lineScan= new Scanner(line);//Se crea el objeto lineScan en el que solo entra el String line

	  while(lineScan.hasNext()){//.hasNext revisa si la cadena tiene mas elementos.
		String word = lineScan.next();//Con .next cada elemento se guarda en word

		//Character.toUpperCase convierte el caracter a mayuscula
		//.charAt regresa el carácter a su posicion, .substring  regresa la cadena.
		newline += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
	}	
	System.out.print(newline.trim());//mostramos la cadena y el .trim elimina los espacios blancos.	

   }

}