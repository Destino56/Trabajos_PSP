package paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<String> nombreHilos= new ArrayList<String>();
		String nombre;
		
		System.out.print("Introduce el número máximo: ");
		int numMax = teclado.nextInt();
		System.out.print("Con cuantos hilos quieres ejecutar el programa: ");
		int numHilos = teclado.nextInt();
		int inicio = 0;
		int parte = numMax/numHilos;
		
		
		/*for(int i=0 ; i<numHilos ; i++) { //No consigo sacar la forma de darle un nombre a cada hilo, probé metiéndolo en un ArrayList
			nombre = "hilo"+i;			  //el nombre de cada uno pero luego no puedo darle ese nombre a los hilos
			nombreHilos.add(nombre);
		}*/
		
		/*HiloNumerosPrimos hilo = new HiloNumerosPrimos(0, 50000);    //Esto lo probé para ver si funcionaba pero no pasa nada no se por qué,						
		HiloNumerosPrimos hilo2 = new HiloNumerosPrimos(50000, 100000);//es como que cuando uso más de un hilo peta
		hilo.start(); 												   
		hilo2.start();*/
		
		
		for(int i=1 ; i<=numHilos ; i++) { //Mi idea era hacerlo así, ya que en teoría se le asignan identificadores diferentes
			System.out.println("numHilos= "+numHilos);//a cada hilo pero no funciona, con esto además es como que borra la consola
			HiloNumerosPrimos hilo = new HiloNumerosPrimos(inicio, parte*i);
			hilo.start();
			inicio=parte*i;
		}
	}

}
