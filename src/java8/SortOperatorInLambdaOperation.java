package java8;

import java.util.ArrayList;
import java.util.List;

public class SortOperatorInLambdaOperation {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(new Product("product1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("product2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("product3", "laptop 1", 1200, 6, "Manufacturer 2"));
		products.add(new Product("product4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("product5", "laptop 3", 7000, 9, "Manufacturer 2"));

		System.out.println("Ascending order");
		System.out.println("");

		products.stream().sorted((p1, p2) -> (int) (p1.getPrice() - p2.getPrice())).forEach(product -> {
			System.out.println(product.toString());
			System.out.println(
					"====================================================================================================");
		});

		System.out.println("");
		System.out.println("Descending Order");
		System.out.println("");

		products.stream().sorted((p1, p2) -> (int) (p2.getPrice() - p1.getPrice())).forEach(product -> {
			System.out.println(product.toString());
			System.out.println(
					"====================================================================================================");
		});

	}

}
