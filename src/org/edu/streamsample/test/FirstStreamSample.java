package org.edu.streamsample.test;

import java.util.stream.Stream;

public class FirstStreamSample {
	
	public static void main(String a[]) {
		Stream.of("A", "B", "C").forEach(System.out::println);
	}

}
