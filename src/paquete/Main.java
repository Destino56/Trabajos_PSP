package paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el número máximo: ");
		int numMax = teclado.nextInt();
		System.out.print("Con cuantos hilos quieres ejecutar el programa: ");
		int numHilos = teclado.nextInt();
		int inicio = 0;
		int parte = numMax/numHilos;
		
		for(int i=1 ; i<=numHilos ; i++) {
			HiloNumerosPrimos claseHilo = new HiloNumerosPrimos(inicio, parte*i);
			Thread hilo = new Thread(claseHilo);
			hilo.start();
			inicio=parte*i;
		}
	}

}
