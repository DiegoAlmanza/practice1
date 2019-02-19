//Nombre: Diego Almanza Beyless
//Dia: 19/02/2019
//Hora: 23:12
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa26{
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese el numero octal: ");//Pedimos que se ingrese el numero octal.
	String a= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en a.
	
	
	int a1=Integer.parseInt(a, 8);//Se convierte el numero octal a decimal.
	String b=Integer.toBinaryString(a1);//a1 Se convierte en numero binario
	
	System.out.print("Numero Binario: "+b);//Mostramos el resultado.

}
}
