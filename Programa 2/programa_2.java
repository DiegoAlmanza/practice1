/**
	Diego Almanza 
	169838
 */
import java.util.Scanner;

class programa2 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 
	int n1,n2,s;        
	
	System.out.print("Ingrese el primero numero: ");
	n1=sc.nextInt();	

	System.out.print("Ingrese el segundo numero: ");
	n2=sc.nextInt();

	s=n1+n2;

	System.out.print("Resultado= "+s);
	
    }
}