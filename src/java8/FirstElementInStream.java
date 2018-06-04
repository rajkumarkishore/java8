package java8;

import java.util.ArrayList;
import java.util.List;

public class FirstElementInStream {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
		products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
		products.add(new Product("p3", "laptop 10", 1200, 6, "Manufacturer 2"));
		products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
		products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2"));

		System.out.println("First element in list");
		System.out.println("");

		Product firstProduct = products.stream().findFirst().get();
		
		System.out.println(firstProduct.toString());

		System.out.println("=======================================================================================");

		System.out.println("");
		System.out.println("First laptop in list");
		System.out.println("");

		Product firstLaptop = products.stream().filter(p -> p.getName().contains("laptop")).findFirst().get();
		
		System.out.println(firstLaptop.toString());

		System.out.println("=======================================================================================");
	}

}
