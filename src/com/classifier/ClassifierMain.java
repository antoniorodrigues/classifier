package com.classifier;

public class ClassifierMain {
	public static void main(String[] args) throws Exception {
		double[] testClassifier = ImagesClassifier.main(args);

		System.out.println("precision: " + testClassifier[0]);
		System.out.println("recall: " +  testClassifier[1]);
		System.out.println("f-measure: " +  testClassifier[2]);
	}
}
