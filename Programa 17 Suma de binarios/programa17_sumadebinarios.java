//Nombre: Diego Almanza Beyless
//Dia: 14/02/2019
//Hora: 12:14
 import java.util.Scanner;//Nos permite crear el Scaner para poder leer valores de entrada de varios tipos.

class programa17 {
    public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);//Se crea el Scanner para poder ingresar datos desde el teclado y poder almacenarlos.
	System.out.print("Ingrese el primer numero binario: ");
	String a=sc.nextLine();

	System.out.print("Ingrese el segundo numero binario: ");
	String b=sc.nextLine();	

	int a1 = Integer.parseInt(a, 2);//
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;

        String r = Integer.toBinaryString(c1);
	System.out.print("Resultado: "+r);
}
}