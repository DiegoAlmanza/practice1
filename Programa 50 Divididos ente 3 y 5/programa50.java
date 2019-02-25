//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 20:44


public class programa50{
public static void main(String args[]) {
	
	System.out.print("\nDivididos entre 3: ");
	for(int i=1;i<=100;i++){
	   if(i%3==0){
		System.out.print(i+", ");        
	 }
	}
	System.out.print("\nDivididos entre 5: ");
	for(int i=1;i<=100;i++){
	   if(i%5==0){
		System.out.print(i+", ");
	    }
        }
	System.out.print("\nDivididos entre 3 y 5:  ");
	for(int i=1;i<=100;i++){
   	   if(i%3==0 && i%5==0){
		System.out.print(i+", ");
	      }
        }	
   }
}