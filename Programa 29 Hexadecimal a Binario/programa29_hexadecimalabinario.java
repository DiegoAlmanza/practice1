//Nombre: Diego Almanza Beyless
//Dia: 19/02/2019
//Hora: 23:29
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa29{
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese el numero Hexadecimal: ");//Pedimos que se ingrese el numero Hexadecimal.
	String a= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en a.
	
	
	int a1=Integer.parseInt(a, 16);//Se convierte el numero hexadecimal a decimal.
	String b=Integer.toBinaryString(a1);//
	
	System.out.print("Numero Binario: "+b);//Mostramos el resultado.

}
}