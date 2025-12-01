package Lab2;
import java.util.Scanner;

public class Lab2_1 {
	public static void main(String[] args) {
		Scanner getnumber = new Scanner(System.in);
		System.out.println("Input number 1 : ");
		int num1 = getnumber.nextInt();
		
		System.out.println("Input number 2 : ");
		int num2 = getnumber.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Your Number 1 + Number 2 = " + sum);
	}
}
