package cm.javapractice;

import java.util.stream.IntStream;

public class DoubleMinValue {

	public static void main(String[] args) {
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}

}
