//Nombre: Diego Almanza Beyless
//Dia: 22/02/2019
//Hora: 21:12

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada
import java.lang.Math;//Ultiliamos la calse .Math para realiar calculos matematicos comunes 

class programa34{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.

	System.out.print("Ingrese la medida de un lado del hexagono: ");//Pedimos que se ingerese el primer numero.
	int s= sc.nextInt();//El scanner permite ingresar el numero al usuario y almacenarlo en a.

	double a= (6*(s*s))/(4*Math.tan(Math.PI/6));

	System.out.print("El area del hexagono es: "+a);		
}
}