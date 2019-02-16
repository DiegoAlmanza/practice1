//Nombre: Diego Almanza Beyless
//Dia: 16/02/2019
//Hora: 15:13
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa20{
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese el numero decimal: ");//Pedimos que se ingrese el numero entero.
	int a= sc.nextInt();//El scanner permite ingresar el numero al usuario y almacenarlo en a.

	String a1= Integer.toHexString(a);//Convierte el numero a base 16.
	
	System.out.print("Hexadecimal: "+a1);//Mostramos el resultado.

}
}