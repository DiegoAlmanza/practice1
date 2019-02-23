//Nombre: Diego Almanza Beyless
//Dia: 22/02/2019
//Hora: 21:38

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada
import java.lang.Math;//Ultiliamos la calse .Math para realiar calculos matematicos comunes 

class programa35{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Objeto para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese cuantos lados tiene el poligono: ");//Pedimos que se ingrese el numero de lados que tiene el poligono.
	int n= sc.nextInt();//sc permite ingresar numeros al usuario y almacenarlos en n. 
	
	System.out.print("Ingrese la medida de un lado del hexagono: ");//Pedimos que se ingerese el primer numero.
	int s= sc.nextInt();//sc permite ingresar el numero al usuario y almacenarlo en s.

	double a= (n*(Math.pow(s,2)))/(4*Math.tan(Math.PI/n));

	System.out.print("El area del hexagono es: "+a);		
}
}