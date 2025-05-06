package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		

		System.out.println();
		System.out.println("Product data: " + product);
		
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt(); // esse quantity
		product.addProducts(quantity); //e esse quantity sao os mesmos, ele adicionam ao método product.addProducts que o recebe, lê e faz a operação
		
		
		System.out.println();
		System.out.println("Updated data: " + product); 
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt(); 
		product.removeProducts(quantity); 
		
		
		System.out.println();
		System.out.println("Updated data: " + product); 
		
		
				
		sc.close();
		
	}

}


