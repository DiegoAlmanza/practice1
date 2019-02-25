//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 23:32

import java.util.Scanner;

class programa54{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);	

	System.out.print("\nIngrese los segundos: ");
	int s= sc.nextInt();

	int seg= s%60;
	int horas= s/60;
	int min= horas%60;
	horas= horas/60;
	System.out.print(horas+":"+min+":"+seg); 
	
	
   }
}