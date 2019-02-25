//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 21:11

import java.util.Scanner;

public class programa51{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);	

	System.out.print("\nIngrese un numero entero: ");
	String cad= sc.nextLine();

	int r= Integer.parseInt(cad);
	System.out.print("Valor del numero entero: "+r);	
   }
}