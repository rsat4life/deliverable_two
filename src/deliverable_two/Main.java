package deliverable_two;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String string1 = scnr.nextLine();
		String string2 = scnr.nextLine();
		int string1Total = 0;
		int string2Total = 0;
		int i;
		int j;
		for (i = 0; i < string1.length(); i++) {
			System.out.println(string1.charAt(i) + ": " + (int) (string1.charAt(i)));
			string1Total = string1Total + (int) (string1.charAt(i));
		}
		System.out.println("");
		for (j = 0; j < string2.length(); j++) {
			System.out.println(string2.charAt(j) + ": " + (int) (string2.charAt(j)));
			string2Total = string2Total + (int) (string2.charAt(j));
		}
		System.out.println("");
		int resultDiff = Math.abs(string1Total - string2Total);
		System.out.println("The absolute difference between the two strings is: " + resultDiff);

	}

}
