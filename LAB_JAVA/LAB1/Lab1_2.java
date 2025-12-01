package Lab1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_2 {
	public static void main(String[] args) {
		Scanner getnumber = new Scanner(System.in);
		
		System.out.println("Input Width : ");
		float width = getnumber.nextFloat();
		
		System.out.println("Input Height : ");
		float height = getnumber.nextFloat();
		
		float area = width * height;
		System.out.println("Your Area =" + area);

	}
}
