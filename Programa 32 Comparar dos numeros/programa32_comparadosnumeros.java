//Nombre: Diego Almanza Beyless
//Dia: 22/02/2019
//Hora: 19:16

import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa32{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.

	System.out.print("Ingrese el primer numero: ");//Pedimos que se ingerese el primer numero.
	int a= sc.nextInt();//El scanner permite ingresar el numero al usuario y almacenarlo en a.

	System.out.print("Ingrese le segundo numero: ");//Pedimos que se ingrese el segundo numero.
	int b= sc.nextInt();//El scanner permite ingresar el numero al usuario y almacenarlo en b.

	if(a==b){
		System.out.print(a+"="+b);
	}else{
		System.out.print(a+"!="+b);
	}

	if(a<b)
		System.out.print("\n"+a+"<"+b);
	if(a>b)
		System.out.print("\n"+a+">"+b);
	if(a<=b)
		System.out.print("\n"+a+"<="+b);
	if(a>=b)
		System.out.print("\n"+a+">="+b);
}
}