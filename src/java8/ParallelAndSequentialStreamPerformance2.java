package java8;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class ParallelAndSequentialStreamPerformance2 {

	public static void main(String[] args) {

		long parallelTime = 0;
		long sequentialTime = 0;

		long time;
		BigDecimal sum;

		for (int i = 0; i <= 5; i++) {

			time = System.currentTimeMillis();
			sum = Stream.generate(() -> new BigDecimal(Math.random() * 10000)).limit(1000000).parallel()
					.map(b -> b.multiply(BigDecimal.TEN)).reduce(BigDecimal.ZERO, (a, b) -> a.add(b));

			if (i > 0) {
				parallelTime += System.currentTimeMillis() - time;
			}

			time = System.currentTimeMillis();
			sum = Stream.generate(() -> new BigDecimal(Math.random() * 10000)).limit(1000000).sequential()
					.map(b -> b.multiply(BigDecimal.TEN)).reduce(BigDecimal.ZERO, (a, b) -> a.add(b));

			if (i > 0) {
				sequentialTime += System.currentTimeMillis() - time;
			}

		}

		System.out.println("Average sequential time: " + sequentialTime / 5);
		System.out.println("Average parallel time: " + parallelTime / 5);
	}

}
