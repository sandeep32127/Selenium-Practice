package com.java8;

import java.util.stream.IntStream;

public class LambdaSAM {

	public static void main(String[] args) {
		SampleSAM sam = new SampleSAM() {

			@Override
			public void printChk(String name) {
				System.out.println("The value is : " + name);

			}
		};

		sam.printChk("Bhairava");
		
		SampleSAM sam1 = (name) -> System.out.println("The value from Lambda is : " + name);
		sam1.printChk("Hash");
		//IntStream.range(0, 301).forEach(num -> System.out.println(num));
	}
}
