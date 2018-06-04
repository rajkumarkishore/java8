package java8;

import java.util.ArrayList;
import java.util.List;

public class MinMaxLambdaExpression {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
		products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2"));

		Product max = products.stream().max((p1, p2) -> (int) (p1.getPrice() - p2.getPrice())).get();
		System.out.println("Product with maximum price ");
		System.out.println(max.toString());

		System.out.println();
		
		Product min = products.stream().min((p1, p2) -> (int) (p1.getPrice() - p2.getPrice())).get();
		System.out.println("Product with minimum price");
		System.out.println(min.toString());

	}

}
