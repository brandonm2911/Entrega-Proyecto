package entregaproyecto;

import java.util.Scanner;

/**
 *
 * @author hijos
 */
public class Ejercicio2 {
    
public static void main(String[] args) {
		
	Scanner Scanner = new Scanner(System.in);
		
	System.out.println("Ingrese la cantidad de horas a comparar");
	int numeroDeHoras = Scanner.nextInt();
		
	if(numeroDeHoras>=0) { 
			
		
		int semana = numeroDeHoras/168;
		int dias = (numeroDeHoras % 168) /24;
		int horas =  numeroDeHoras % 24;
		
		System.out.println("Dado el total de Horas ingresadas: " + numeroDeHoras);
		System.out.println("Son " + semana +" semanas");
		System.out.println("son " + dias  + " dias");
		System.out.println("son "+ horas +" horas");
		
			}
		else {
		System.out.println("Las horas ingresadas son negativas: " + numeroDeHoras);
			}
	}
}
