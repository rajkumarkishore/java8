package java8;

import java.util.ArrayList;
import java.util.List;

public class LimitOperatorLambdaExpression {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(new Product("product1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("product2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("product3", "laptop 1", 1200, 6, "Manufacturer 2"));
		products.add(new Product("product4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("product5", "laptop 3", 7000, 9, "Manufacturer 2"));

		System.out.println("Limit");
		System.out.println("");

		products.stream().limit(2).forEach(product -> {
			System.out.println(product.toString());
			System.out.println(
					"==========================================================================================");

		});

	}

}
