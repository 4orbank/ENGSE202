import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        short Number;
        System.out.print("input Number = ");
        Number = scanner.nextShort();

        if (Number % 2 != 0)
            System.out.println("Number is odd");
        else
            System.out.println("Number is even");
    }
}
