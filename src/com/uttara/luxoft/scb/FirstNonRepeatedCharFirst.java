package com.uttara.luxoft.scb;

public class FirstNonRepeatedCharFirst {

	public static void main(String[] args) {
		String inputStr = "teeater";

		for (char i : inputStr.toCharArray()) {
			if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: " + i);
				break;
			}

		}

	}
}
