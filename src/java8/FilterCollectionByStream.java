package java8;

import java.util.ArrayList;
import java.util.List;

public class FilterCollectionByStream {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
		products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2"));

		System.out.println("Or Condition");
		System.out.println("");

		products.stream().filter(p -> p.getId().equalsIgnoreCase("p1") || p.getId().equalsIgnoreCase("p2"))
				.forEach(product -> {
					System.out.println(product.toString());
					System.out.println(
							"====================================================================================================");
				});

		System.out.println("");
		System.out.println("And Condition");
		System.out.println("");

		products.stream().filter(p -> p.getPrice() > 800 && p.getPrice() < 9000).forEach(product -> {
			System.out.println(product.toString());
			System.out.println(
					"====================================================================================================");
		});

	}

}
