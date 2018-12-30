package org.edu.streamsample.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamSample {

	public static void main(String a[]) {

		/**
		 * There are two kind of stream operations, intermediate operations and terminal
		 * operations. Intermediate operation return stream itself and we can create a
		 * chain of intermediate operations
		 */

		// Stream.of("A", "B", "C").forEach(System.out::println);

		mapOperation();
		System.out.println();

	}

	public static void skipWithLambda() {
		/**
		 * Same can be written using lambda expression
		 */
		IntStream.range(1, 9).skip(5).forEach(x -> System.out.print(x));
	}

	public static void skipOperation() {
		/**
		 * Skip is an intermediate operation this skip specified number of elements
		 */
		IntStream.range(1, 9).skip(5).forEach(System.out::print);
	}

	public static void forEachSample() {
		/**
		 * forEach is a terminal operation
		 */
		IntStream.range(1, 9).forEach(System.out::print);
	}

	public static void arithmeticOperation() {
		/**
		 * sum and count are terminal operations. Average, min and max are intermediate
		 * operations
		 */
		System.out.println(IntStream.range(1, 5).sum());

		System.out.println(IntStream.range(1, 5).average().getAsDouble());

		System.out.println(IntStream.range(1, 5).max().getAsInt());

		System.out.println(IntStream.range(1, 5).min().getAsInt());

		System.out.println(IntStream.range(1, 5).count());
	}

	public static void sortOperation() {
		Stream.of("Abin", "Vikas", "Chandi", "Sanal", "Sujeesh").sorted().findFirst().ifPresent(System.out::print);
		System.out.println();
		/**
		 * Reverse order
		 */
		Stream.of("Abin", "Vikas", "Chandi", "Sanal", "Sujeesh").sorted(Comparator.reverseOrder()).findFirst()
				.ifPresent(System.out::print);

	}
	
	public static  void filterOperation() {
		String[] array  = {"One", "Two", "Three", "Four", "Five", "Six" , "Seven", "Eight", "Nine", "Ten"};
		Arrays.stream(array).filter(x -> x.startsWith("T")).sorted().forEach(System.out::println);
		Arrays.stream(array).filter(x -> x.startsWith("T")).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	public static void mapOperation() {
		IntStream.range(1, 5).map(x -> x * x).average().ifPresent(System.out::println);
		
		IntStream.range(1, 5).filter(x-> x/2 == 0)
		.map(x -> x * x).average().ifPresent(System.out::println);
		
		
	}

}
