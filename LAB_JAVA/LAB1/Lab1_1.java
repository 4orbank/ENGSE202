import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short num1 , num2 ;
        System.out.print("ใส่เลขที่ 1 = ");
        num1 = scanner.nextShort();
        System.out.print("ใส่เลขที่ 2 = ");
        num2 = scanner.nextShort();

        short sum = (short) (num1 + num2);

        System.out.println("Sum: " + sum);

    }
}
