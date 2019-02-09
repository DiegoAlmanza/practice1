//Nombre: Diego Almanza Beyless
//Dia: 08/02/2019
//Hora: 17:57
 import java.util.Scanner;//Nos permite crear el Scaner para poder leer valores de entrada de varios tipos.

class programa12 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	double n1,n2,n3,p;//Declaramos las variables.
	
	System.out.print("Ingrese el primer numero: ");
	n1=sc.nextDouble();
	System.out.print("Ingrese el segundo numero: ");
	n2=sc.nextDouble();
	System.out.print("Ingrese el tercer numero: ");
	n3=sc.nextDouble();
	
	p=(n1+n2+n3)/3;
	System.out.print("Promedio= "+p);
}
}