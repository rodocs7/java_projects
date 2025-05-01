package util;

public class Calculator {
	
	public final double PI = 3.14; 
	

	public double circumference(double radius) {  // preciso por static para chamar do main, pois static só chama static
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		
	}

}
