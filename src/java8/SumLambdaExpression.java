package java8;

import java.util.ArrayList;
import java.util.List;

public class SumLambdaExpression {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
		products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("p5", "laptop 3", 2300, 7, "Manufacturer 2"));

		int sum = products.stream().mapToInt(p -> p.getQuantity()).sum();
		System.out.println("Sum of quantities all prosucts: " + sum);
		System.out.println("");

		int sumOfmobiles = products.stream().filter(p -> p.getName().contains("mobile")).mapToInt(p -> p.getQuantity())
				.sum();
		System.out.println("Sum of quantities of all mobiles: " + sumOfmobiles);
		System.out.println("");

		long totalCost = products.stream().mapToLong(p -> p.getPrice() * p.getQuantity()).sum();
		System.out.println("Total cost of all products: " + totalCost);
	}

}
