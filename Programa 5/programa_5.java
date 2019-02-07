/**
	Diego Almanza 
	169838
 */
import java.util.Scanner;

class programa5 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	int a,b,r;
	System.out.print("Ingrese el primer numero: ");
	a=sc.nextInt();
	System.out.print("Ingrese el segundo numero: ");
	b=sc.nextInt();
	r=a*b;
	System.out.print(a+"x"+b+"="+r);

}
}