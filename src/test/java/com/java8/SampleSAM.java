package com.java8;

@FunctionalInterface
public interface SampleSAM {
	
	void printChk(String name);
	
	static void displ() {
	}
	
	default void check() {
	}
}
