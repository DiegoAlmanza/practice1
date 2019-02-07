//Nombre: Diego Almanza Beyless
//Dia: 07/02/2019
//Hora: 12:33


import java.util.Scanner;

class programa6 {
    public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos. 
	
	int n1,n2;// se declaran las variables         
	
	System.out.print("Ingrese el primero numero: ");//Se pide que se ingrese el primer numero. 
	n1=sc.nextInt();//El Scanner permite ingresar el numero al usuario y almacenarlo en n1.	

	System.out.print("Ingrese el segundo numero: ");//Se pide que se ingrese el segundo numero. 
	n2=sc.nextInt();//El Scanner permite ingresar el numero al usuario y almacenarlo en n2.
	
	int s=n1+n2;//Se crea un entero s para almacenar la suma de n1+n2.
	int r=n1-n2;//Se crea un entero r para almacenar la resta de n1-n2.
	int m=n1*n2;//Se crea un entero m para almacenar la multiplicacion de n1*n2.
	int d=n1/n2;//Se crea un entero d para almacenar la division de n1/n2.
	int mod=n1%n2;//Se crea un entero mod para almacenar el residuo de n1%n2.
	
	    //Muestra los resultados. 
	System.out.print(n1+"+"+n2+"="+s+ "\n");
	System.out.print(n1+"-"+n2+"="+r+ "\n");
	System.out.print(n1+"x"+n2+"="+m+ "\n");
	System.out.print(n1+"/"+n2+"="+d+ "\n");
	System.out.print(n1+"mod"+n2+"="+mod+ "\n");
}
}
