//Nombre: Diego Almana Beyles
//Fecha: 23/02/2019
//Hora: 16:16

import java.util.Scanner;

class programa42{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in); 

	String password= "abc@123", access;
	int x=0;
		
	do{
		System.out.print("\nIngrese la contraseña: ");
		access= sc.nextLine();

			if(access==password){
				x=1;			
			}else{
				x=0;
			}
    		}while(x==1);
  }
}