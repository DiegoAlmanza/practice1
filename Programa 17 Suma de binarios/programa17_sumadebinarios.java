//Nombre: Diego Almanza Beyless
//Dia: 14/02/2019
//Hora: 12:14
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada 

class programa17 {//Se declara la clase 
    public static void main(String[] args) {//
	
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder leer valores desde el teclado.
	System.out.print("Ingrese el primer numero binario: ");//Pedimos que se ingrese el primer valor. 
	String a=sc.nextLine();//El Scanner permite ingresar el numero al usuario y almacenarlo en a.

	System.out.print("Ingrese el segundo numero binario: ");//Pedimos que se ingrese el segundo valor. 
	String b=sc.nextLine();////El Scanner permite ingresar el numero al usuario y almacenarlo en b.	

	int a1 = Integer.parseInt(a, 2);//La funcion Integer.parseInt convierte la cadena a un numero entero 
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;//Sumamos los dos numeros 

        String r = Integer.toBinaryString(c1);//Esta funcion convierte la suma a binario. 
	System.out.print("Resultado: "+r);//Mostramos el resultado 
}
}
