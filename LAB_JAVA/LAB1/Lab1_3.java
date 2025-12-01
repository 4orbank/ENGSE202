package Lab1;

import java.util.Scanner;

public class Lab1_3 {
	public static void main(String[] args) {
		Scanner examinenumber = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int number = examinenumber.nextInt();
		
		if (number % 2 != 0) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
		examinenumber.close();
	}
}
