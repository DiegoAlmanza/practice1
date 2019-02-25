//Nombre: Diego Almanza Beyless
//Fecha: 25/02/2019
//Hora: 00:20

import java.util.Scanner;

class programa57{
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);	

	System.out.print("\nIngrese un numero: ");
	int n= sc.nextInt();
 	
	int cont=0;
	for(int i=1;i<=(int)Math.sqrt(n);i++){//Math.sqrt hace la raiz cuadrada positiva redondeada de n. 
		if(n%i==0 && (i*i)!=n){//si el residuo de x entre i es igual a cero y i al cuadrado es diferente de n
			cont+=2;//a cont se le suma 2
	}else if(i*i==n){//solo si el cuadrado de i es igual a n  
		cont++;//con se incrementa 1
		}
      } 
	System.out.print(cont);// se imprime el resultado   
   }
}