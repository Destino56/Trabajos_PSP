package paquete;

import java.util.Scanner;

public class HiloNumerosPrimos extends Thread{
	
	int inicio;
	int tope;
	
	public HiloNumerosPrimos(int inicio, int tope) {
		this.inicio = inicio;
		this.tope = tope;
	}
	
	@Override
	public void run() {
		calculaNumPrimos(inicio, tope);
	}
	
	private void calculaNumPrimos(int inicio, int tope) {
		//BigInteger bigInteger = null; //He probado con el isProbablyPrime pero me termina de funcionar, así que lo he hecho marranero
										//para ver si al menos va
		for(int i=inicio ; i<tope ; i++) {
			/*if(bigInteger.isProbablePrime(i)) {
				System.out.print(i+" ");
			}*/
			if(i%2==0 || i%3==0 || i%5==0 || i%7==0 || i%11==0 || i%13==0 || i%17==0 || i%19==0 || i%23==0 || i%29==0) {			
			}else {
				System.out.print(i+" ");
			}
			//teclado.nextLine();
		}
	}
}
