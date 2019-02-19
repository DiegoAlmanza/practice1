//Nombre: Diego Almanza Beyless
//Dia: 19/02/2019
//Hora: 23:44
 
class programa31{
    public static void main(String[] args) {
	//Usamos System.getProperty para que este metodo determine las propiedades actuales del systema.	
	System.out.print("\nJava Version: "+System.getProperty("java.version"));
    	System.out.print("\nJava Runtime Version: "+System.getProperty("java.runtime.version"));
    	System.out.print("\nJava Home: "+System.getProperty("java.home"));
    	System.out.print("\nJava Vendor: "+System.getProperty("java.vendor"));
    	System.out.print("\nJava Vendor URL: "+System.getProperty("java.vendor.url"));
    	System.out.print("\nJava Class Path: "+System.getProperty("java.class.path")+"\n");
}
}