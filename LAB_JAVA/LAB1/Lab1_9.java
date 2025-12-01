package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_9 {
	public static void main(String[] args) {
        Scanner holyfuck = new Scanner(System.in);
        System.out.print("Enter the integers : ");
        int N = holyfuck.nextInt();

        if (N <= 0) {
            System.out.println("Err: pls enter a positive integer.");
        } 
        else {
            int[] nums = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                nums[i] = holyfuck.nextInt();
                sum += nums[i]; 
            }

            float avg = (float) sum / N;

            System.out.printf("Average = %.2f", avg);
        }
        holyfuck.close();
	}
}
