//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 19:31
import java.util.Scanner;//Importamos la libreria java.util para usar la clase Scanner para poder leer valores de entrada

class programa44{
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);  

	System.out.print("Ingrese un numero: ");
	int n= sc.nextInt();

	System.out.print(n+" + "+n+n+" + "+n+n+n);

 }
}