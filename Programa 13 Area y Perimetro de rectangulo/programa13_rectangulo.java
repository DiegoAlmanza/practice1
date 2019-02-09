//Nombre: Diego Almanza Beyless
//Dia: 08/02/2019
//Hora: 18:12
 import java.util.Scanner;//Nos permite crear el Scaner para poder leer valores de entrada de varios tipos.

class programa13 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	double n1,n2,p,a;//Declaramos las variables.
	
	System.out.print("Ingrese el valor de la base: ");//Se pide que se ingrese la base
	n1=sc.nextDouble();//El Scanner permite ingresar el numero al usuario y almacenarlo en n1.
	System.out.print("Ingrese el valor de la altura: ");//Se pide que se ingrese la altura
	n2=sc.nextDouble();//El Scanner permite ingresar el numero al usuario y almacenarlo en n2.
	
	a=n1*n2;
	p=2*(n2+n1);
	
	System.out.print("Altura: \n"+a);
	System.out.print("\nPerimetro: \n"+p);
}
}