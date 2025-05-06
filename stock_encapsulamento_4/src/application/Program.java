package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada dos dados do produto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        // Instanciação do objeto com o construtor com 3 argumentos
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        // Adicionando produtos
        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.addProducts(quantityToAdd);

        System.out.println("Updated data: " + product);

        // Removendo produtos
        System.out.print("\nEnter the number of products to be removed from stock: ");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove);

        System.out.println("Updated data: " + product);

        sc.close();
    }
}
