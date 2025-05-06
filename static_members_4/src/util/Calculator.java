package util;

public class Calculator {
    
    public static final double IOF = 0.06;

    public static double dollarToReal(double dollar, double howmuch) {
    	double calcule = dollar * howmuch;
    	return calcule + calcule * IOF;
    }
}
