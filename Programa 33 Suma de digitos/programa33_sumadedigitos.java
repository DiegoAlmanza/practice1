//Nombre: Diego Almanza Beyless
//Dia: 22/02/2019
//Hora: 20:42

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa33{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.

	System.out.print("Ingrese un numero: ");//Pedimos que se ingerese el primer numero.
	String cad= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en a.

	String[] digs= cad.split("");//El split separa la cadena y lo guarda en el arreglo.

	String n1= digs[0];//n1 es el caracter almacenado en la posicion cero del arreglo.	
	String n2= digs[1];//n2 es el caracter almacenado en la posicion uno del arreglo.

	int a= Integer.parseInt(n1, 10);//convertimos n1 a entero y lo almacenamos en a. 
	int b= Integer.parseInt(n2, 10);//convertimos n2 a entero y lo almacenamos en b.
	int s=a+b;//sumamos los dos numeros 
	
	System.out.print("Resultado: "+s);//mostramos el resultado.
}
}