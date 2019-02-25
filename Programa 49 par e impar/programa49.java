//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 20:26

import java.util.Scanner;

public class programa49{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);

	System.out.print("Ingrese un numero: ");
	int n= sc.nextInt();

	 if(n%2==0){\\Si el residuo es 0 entonces es numero par.
		System.out.print("1");
         }else{//Si no, es impar.
		System.out.print("0");
	 } 	
   }
}