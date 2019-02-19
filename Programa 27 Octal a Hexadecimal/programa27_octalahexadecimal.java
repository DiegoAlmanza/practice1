//Nombre: Diego Almanza Beyless
//Dia: 19/02/2019
//Hora: 23:17
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa27{
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese el numero octal: ");//Pedimos que se ingrese el numero octal.
	String a= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en a.
	
	
	int a1=Integer.parseInt(a, 8);//Se convierte el numero octal a decimal.
	String b=Integer.toHexString(a1);//a1 Se convierte en numero Hexadecimal.
	
	System.out.print("Numero Hexadecimal: "+b);//Mostramos el resultado.

}
}