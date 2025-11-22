package Lab1;

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();    // รับค่าความกว้าง
        double height = sc.nextDouble();   // รับค่าความสูง

        double area = width * height;      // คำนวณพื้นที่

        System.out.println(area);          // แสดงผลลัพธ์
    }
}
