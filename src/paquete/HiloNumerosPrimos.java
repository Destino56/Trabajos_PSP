package paquete;

import java.math.BigInteger;
import java.util.Scanner;

public class HiloNumerosPrimos implements Runnable{
	
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
		//BigInteger bigInteger = null; 
		int cont=0;
		for(int i=inicio ; i<tope ; i++) {
			if(isPrime(i)) {
				System.out.print(i+"  ");
				cont++;
				if(cont%10==0) {
					System.out.println();
				}
			}
			
		}
	}
	
	public static boolean isPrime(int num) {
		BigInteger checkNumber = new BigInteger(String.valueOf(num));
		return checkNumber.isProbablePrime(num);
	}

}
