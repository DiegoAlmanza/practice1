//Nombre: Diego Almanza Beyless
//Dia: 2/02/2019
//Hora: 00:43

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada
import java.lang.Math;//Ultiliamos la calse .Math para realiar calculos matematicos comunes.
 
class programa36{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Objeto para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese la latitud de la cordenada 1: ");//Pedimos que se ingrese la latitud de la primera cordenada.
	double la1= sc.nextDouble();//sc permite ingresar la latitud al usuario y almacenarlo en l1.
	System.out.print("Ingrese la longitud de la cordenada 1: ");		
	double lo1= sc.nextDouble();
	
	System.out.print("Ingrese la latitud de la cordenada 2: ");
	double la2= sc.nextDouble();
	System.out.print("Ingrese la longtud de la cordenada 2: ");
	double lo2= sc.nextDouble();

	//Convertimos las cordenadas a radianes.

	la1= Math.toRadians(la1);
	lo1= Math.toRadians(lo1);
	la2= Math.toRadians(la2);
	lo2= Math.toRadians(lo2);

	double r=6371.01;//Declaramos el radio de la tierra
 
	//Claculamos la distancia con la formula.
	double d= r*Math.acos(Math.sin(la1)*Math.sin(la2)+Math.cos(la1)*Math.cos(la2)*Math.cos(lo1-lo2));

	System.out.print("La distancia entre los dos puntos es de: "+d+" km");//Mostramos el resultado
}
}