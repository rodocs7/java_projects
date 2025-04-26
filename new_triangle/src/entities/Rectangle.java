package entities;

public class Rectangle {
	
	public double widght;
	public double height;
	
	public double area() {
		return widght * height;
	}
	
	public double perimeter() {
		return 2 * (widght + height);
	}
	
	public double diagonal() {
		return Math.sqrt(widght * widght + height * height);
	}
	
	
}


	