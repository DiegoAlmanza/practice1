//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 21:38

import java.util.Scanner;

class programa53{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);	

	System.out.print("\nIngrese el primer numero: ");
	int p= sc.nextInt();

	System.out.print("\nIngrese el segundo numero: ");
	int q= sc.nextInt();

	System.out.print("\nIngrese el tercer numero: ");
	int r= sc.nextInt();	

	boolean suma = (p < q && q < r  && p < r);
	
	System.out.print("\nEl resultado es: "+suma);
	
   }
}