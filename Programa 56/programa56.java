//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 23:50

import java.util.Scanner;

class programa56{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);	

	System.out.print("\nIngrese tres numeros: ");
	int n1= sc.nextInt();
 	int n2= sc.nextInt();
	int n3= sc.nextInt();
	
	System.out.print("Resultado: "+result(n1,n2,n3));
   }
	public static int result(int n1, int n2, int n3) {	
		if (n1%n3 == 0)
			return( n2/n3 - n1/n3 + 1);
		return(n2/n3 - n1/n3);
}
}