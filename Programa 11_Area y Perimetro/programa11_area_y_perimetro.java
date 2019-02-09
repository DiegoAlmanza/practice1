//Nombre: Diego Almanza Beyless
//Dia: 08/02/2019
//Hora: 17:25
 import java.util.Scanner;//Nos permite crear el Scaner para poder leer valores de entrada de varios tipos.

class programa11 {
    public static void main(String[] args) {
	double a,p,r;//Declaramos las variables.
	
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.

	System.out.print("Ingrese el radio del circulo: ");//Se pide que se ingrese el radio del circulo.
	r=sc.nextDouble();////El Scanner permite ingresar el numero al usuario y almacenarlo en r.
	
	a=((3.1416)* Math.pow(r, 2));//Se obtiene el area del circulo.
	p=(2*3.1416*r);//Se obtiene el perimetro del circulo.
	
	System.out.print("El Area del circulo es: \n"+a );//Mostramos el area del circulo.
	System.out.print("\nEl Perimetro del circulo es: \n"+p);//Mostramos el perimetro del circulo.
			
}
}