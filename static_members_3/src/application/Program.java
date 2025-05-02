package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Whats is the dollar price: ");
		double money = sc.nextDouble();
		
	
		System.out.print("How many dollars will be bought: " );
		double howmuch = sc.nextDouble();
		
	
		
		
		System.out.printf("Amount to be paid in reais: ", money * howmuch);
		
		
		sc.close();
	}

}
