//Nombre: Diego Almanza Beyless
//Dia: 10/02/2019
//Hora: 23:04

 import java.util.Scanner;//Nos permite crear el Scaner para poder leer valores de entrada de varios tipos.

class programa15 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.

	int n1,n2,i;//Declaramos las variables 

	System.out.print("Ingresa el primer valor: ");
	n1=sc.nextInt();
	System.out.print("Ingresa el segundo valor: ");
	n2=sc.nextInt();
	
	System.out.print("Antes del intercambio: a, b\n" +n1+", "+n2+"\n");
	
	i=n1;
	n1=n2;
	n2=i;
	
	System.out.print("Intercambio: a, b\n" +n1+", "+n2);
}
}