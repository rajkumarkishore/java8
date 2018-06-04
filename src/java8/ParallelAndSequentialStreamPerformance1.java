package java8;

import java.util.ArrayList;
import java.util.List;

public class ParallelAndSequentialStreamPerformance1 {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			emps.add(new Employee("A", 20000));
			emps.add(new Employee("B", 3000));
			emps.add(new Employee("C", 15002));
			emps.add(new Employee("D", 7856));
			emps.add(new Employee("E", 200));
			emps.add(new Employee("F", 50000));
		}

		long t1 = System.currentTimeMillis();
		System.out.println("Sequential stream count: " + emps.stream().filter(e -> e.getSalary() > 15000).count());
		long t2 = System.currentTimeMillis();
		System.out.println("Time elasped: " + (t2 - t1));

		System.out.println();

		long t3 = System.currentTimeMillis();
		System.out.println("Prallel stream count: " + emps.parallelStream().filter(e -> e.getSalary() > 15000).count());
		long t4 = System.currentTimeMillis();
		System.out.println("Time elasped: " + (t4 - t3));

	}

}
