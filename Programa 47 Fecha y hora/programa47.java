//Nombre: Diego Almanza Beyless
//Fecha: 24/02/2019
//Hora: 20:08

import java.text.SimpleDateFormat;//SimpleDateFormat es una calase concreta para formatear y analizar fechas de una manera sensible al entorno local.
import java.util.Calendar;//La clase Calendar proporciona metodos para convertir un instante de tiempo y un conjunto de campos del calendario como año, mes, dia, etc.
import java.util.TimeZone;//Obtiene la hora actual en donde se esta programando 

public class programa47 {

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");//Se crea el objeto para obtener la fecha y la hora actual
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT-7")));//La zona 
		
		System.out.println("\nFecha y Hora: "+cdt.format(System.currentTimeMillis()));//Se imprime el resultado
	}
}