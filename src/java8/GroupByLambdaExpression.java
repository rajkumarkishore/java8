package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByLambdaExpression {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
		products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2"));

		System.out.println("Count no of products in each group");
		System.out.println();

		Map<String, Long> group = products.stream()
				.collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));

		for (Map.Entry<String, Long> g : group.entrySet()) {
			System.out.println("Group Name: " + g.getKey());
			System.out.println("Products: " + g.getValue());

			System.out.println("===================================================================================");
		}

		System.out.println();
		System.out.println("Count quantity of products in each group");
		System.out.println();

		Map<String, Integer> group1 = products.stream()
				.collect(Collectors.groupingBy(Product::getManufacturer, Collectors.summingInt(Product::getQuantity)));
		for (Map.Entry<String, Integer> g : group1.entrySet()) {
			System.out.println("Group Name: " + g.getKey());
			System.out.println("Quantity: " + g.getValue());
			System.out.println("===================================================================================");
		}
	}
}
