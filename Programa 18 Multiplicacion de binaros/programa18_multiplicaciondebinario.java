//Nombre: Diego Almanza Beyless
//Dia: 16/02/2019
//Hora: 16:18
 import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa18 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	
	System.out.print("Ingrese el primer numero binario: ");//Pedimos que se ingrese el primer numero.
	String a= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en a.

	System.out.print("Ingrese el segundo numero binario: ");//Pedimos que se ingrese el segundo numero.
	String b= sc.nextLine();//El scanner permite ingresar el numero al usuario y almacenarlo en b.	

	int a1= Integer.parseInt(a, 2);//La funcion Integer.parseInt convierte la cadena a un numero entero y la base 2 lo hace binario.
	int b1= Integer.parseInt(b, 2);//La funcion Integer.parseInt convierte la cadena a un numero entero y la base 2 lo hace binario.
	int c1= a1*b1;//Sumamos los dos numeros.

	String r= Integer.toBinaryString(c1);//Esta funcion convierte la suma a bnario.
	System.out.print("Resultado= "+r);//Mostramos el resultado.

}
}