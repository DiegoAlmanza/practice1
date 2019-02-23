//Nombre: Diego Almanza Beyless
//Dia: 23/02/2019
//Hora: 02:06

class programa39{
public static void main(String[] args){	
	int Total=0;
	
	for(int i=1; i<=4;i++){
	   for(int j=1; j<=4;j++){
	      for(int k=1; j<=4;k++){
		if(k!=i && k!=j && i!=j){//Si k es diferente de i e j e i es diferente de j 	
			Total++;//Total aumenta su valor 
			System.out.print(i +""+ j +""+ k);//imprimimos el numero
		}
	     }
	  } 	
	}
	System.out.print("\nTotal de numeros: "+Total);	//mostramos cuantos numeros son en total.

}
}