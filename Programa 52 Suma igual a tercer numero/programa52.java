//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 21:18

import java.util.Scanner;

class programa52{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);	

	System.out.print("\nIngrese el primer numero: ");
	int p= sc.nextInt();

	System.out.print("\nIngrese el segundo numero: ");
	int q= sc.nextInt();

	System.out.print("\nIngrese el tercer numero: ");
	int r= sc.nextInt();	

	boolean suma = ((p + q) == r || (q + r) == p || (r + p) == q);
	
	System.out.print("\nEl resultado es: "+suma);
	
   }
}