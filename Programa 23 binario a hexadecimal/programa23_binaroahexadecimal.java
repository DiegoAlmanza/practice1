//Nombre: Diego Almanza Beyless
//Dia: 16/02/2019
//Hora: 23:58
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa23{
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese el numero binario: ");//Pedimos que se ingrese el numero binario.
	String a= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en a.
	
	int a1=Integer.parseInt(a, 2);//Convierte la cadena a numero base dos.
	
	String b=Integer.toHexString(a1);//Convierte el numero base 2 a base 16.
			

	System.out.print("Numero Hexadecimal: "+b);//Mostramos el resultado.

}
}