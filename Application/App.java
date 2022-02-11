package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import EnumEntities.OrderStatus;

public class App {
	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Email: ");
		String email = teclado.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(teclado.next());
		Client client1 = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(teclado.next());
		
		Order order = new Order(birthDate, status, client1);
		
		System.out.print("How many items to this order? ");
		Integer quantityItems = teclado.nextInt();
		teclado.nextLine();
		for(int i = 0; i<quantityItems; i++) {
			System.out.println("Enter #"+ (i+1)+" item data:");
			System.out.print("Product name: ");
			String nameProd = teclado.nextLine();
			System.out.print("Product price:");
			Double price = teclado.nextDouble();
			System.out.println("Quantity:");
			int quantity = teclado.nextInt();
			teclado.nextLine();
			Product product1 = new Product(nameProd, price);
			OrderItem orderItem1 = new OrderItem(quantity, price, product1);
			
			order.addItem(orderItem1);
		}
		System.out.println(order);
		
		
	}
}

