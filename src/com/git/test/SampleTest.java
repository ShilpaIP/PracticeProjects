package com.git.test;

public class SampleTest {
	
	public static void main(String[] args) {
		
		Sample s = new Sample(345);
		s.setSampleName("John Woo");
		System.out.println("New Sample " + s.getSampleName() + " id is: " + s.getSampleId());
		System.out.println("Test change");
		
	}

}
