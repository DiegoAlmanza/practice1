//Nombre: Diego Almanza Beyless
//Dia: 23/02/2019
//Hora: 14:27

import java.nio.charset.Charset;//La libreria Charset contiene los charset standar 

public class programa40{
public static void main(String[] args){
	
	System.out.print("Lista de conjuntos de caracteres disponibles: ");
	for(String str: Charset.availableCharsets().keySet()){
		System.out.print("\n"+str);//Se imprime lo que hay en str.
    }
  }
}