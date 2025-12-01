package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_8 {
	public static void main(String[] args) {
		Scanner Fuckinggod = new Scanner(System.in);
		
		System.out.print("Enter the number of integers : ");
        int N = Fuckinggod.nextInt();
        
        if (N <= 0) {
            System.out.println("Error: N must be a positive integer.");
        } else {
            int[] nb = new int[N];

            for (int i = 0; i < N; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                nb[i] = Fuckinggod.nextInt();
            }

            int maxvalue = nb[0]; 
            for (int i = 1; i < N; i++) {
                if (nb[i] > maxvalue) {
                	maxvalue = nb[i];
                }
            }

            System.out.println("Maximum value = " + maxvalue);
        }
        Fuckinggod.close();
	}
}
