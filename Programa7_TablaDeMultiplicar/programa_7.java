//Nombre: Diego Almanza Beyless
//Dia: 07/02/2019
//Hora: 1:08


import java.util.Scanner;

class programa7 {
    public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.

	int n;//se declara variable entero.

	System.out.print("Ingrese el numero para calcular su tabla de multiplicar: ");//Se pide que si ingrese un numero. 
	n=sc.nextInt();//Permite al usuario ingresar un numero y almacenarlo en la variable n.
	for(int i=1;i<=10;i++){//Se crea un for que va de 1 a 10, i es un contador.
		System.out.print(n+"x"+i+"="+n*i+"\n");//Va imprimiendo la tabla de multiplicar hasta que i<=10.
				
	}
	


}
}