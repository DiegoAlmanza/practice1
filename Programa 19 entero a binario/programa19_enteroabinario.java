//Nombre: Diego Almanza Beyless
//Dia: 16/02/2019
//Hora: 14:52
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa19{
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese el numero entero: ");//Pedimos que se ingrese el numero entero.
	String a= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en a.

	int a1= Integer.parseInt(a,10);//Se convierte la cadena numero entero
	
	String r = Integer.toBinaryString(a1);//Esta funcion convierte el numero entero a binario. 
	System.out.print("Resultado= "+r);//Mostramos el resultado.

}
}