package java8;

import java.util.ArrayList;
import java.util.List;

public class LikeOperatorLambdaExpression {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
		products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2"));

		System.out.println("Search starts with 'mo'");
		System.out.println("");
		products.stream().filter(p -> p.getName().startsWith("mo")).forEach(product -> {
			System.out.println(product.toString());
			System.out.println(
					"====================================================================================================");
		});

		System.out.println("");
		System.out.println("Search starts with 'top 1'");
		System.out.println("");
		products.stream().filter(p -> p.getName().endsWith("top 1")).forEach(product -> {
			System.out.println(product.toString());
			System.out.println(
					"====================================================================================================");
		});
		
		System.out.println("");
		System.out.println("Search contains 'top'");
		System.out.println("");
		products.stream().filter(p -> p.getName().contains("top")).forEach(product -> {
			System.out.println(product.toString());
			System.out.println(
					"====================================================================================================");
		});

	}

}
