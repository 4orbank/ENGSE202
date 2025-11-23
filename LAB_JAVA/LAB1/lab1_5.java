import java.util.Scanner;

public class lab1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner getValue = new Scanner(System.in);

        System.out.println("Choose menu : ");
        int num = getValue.nextInt();

        if (num == 1) {
            System.out.println("Americano");
        }
        else if (num == 2) {
            System.out.println("Latte");
        }
        else if (num == 3) {
            System.out.println("Esspresso");
        }
        else if (num == 4) {
            System.out.println("Mocha");
        }
        else {
            System.out.println("Invalid menu");
        }
    }
}