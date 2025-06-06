package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14; // Final quer dizer que ele é uma constante e não uma variável (tem que ser tudo maiusculo)

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radios: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Circumference: %.2f%n", PI);
		
		
		
		sc.close();
	}
	
	public static double circumference(double radius) {  // preciso por static para chamar do main, pois static só chama static
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		
	}

}
