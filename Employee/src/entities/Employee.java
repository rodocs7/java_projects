package entities;

public class Employee {
	    private String name;
	    private double grossSalary;
	    private double tax;

	    public Employee(String name, double grossSalary, double tax) {
	        this.name = name;
	        this.grossSalary = grossSalary;
	        this.tax = tax;
	    }

	    public double netSalary() {
	        return grossSalary - tax;
	    }

	    public void increaseSalary(double percentage) {
	        grossSalary += grossSalary * percentage / 100.0;
	    }

	    @Override
	    public String toString() {
	        return name + ", $ " + String.format("%.2f", netSalary());
	    }
	}
	