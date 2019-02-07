//Nombre: Diego Almanza Beyless
//Dia: 07/02/2019
//Hora: 12:33


import java.util.Scanner;

class programa6 {
    public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);//
	
	int n1,n2;// se declaran las variables         
	
	System.out.print("Ingrese el primero numero: ");
	n1=sc.nextInt();	

	System.out.print("Ingrese el segundo numero: ");
	n2=sc.nextInt();
	
	int s=n1+n2;
	int r=n1-n2;
	int m=n1*n2;
	int d=n1/n2;
	int mod=n1%n2;
	
	System.out.print(n1+"+"+n2+"="+s+ "\n");
	System.out.print(n1+"-"+n2+"="+r+ "\n");
	System.out.print(n1+"x"+n2+"="+m+ "\n");
	System.out.print(n1+"/"+n2+"="+d+ "\n");
	System.out.print(n1+"mod"+n2+"="+mod+ "\n");
}
}