import java.util.Scanner;
public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int kanam;
        System.out.print("ใส่คะแนนอันน้อยนิดของมึงมา: ");        kanam = scanner.nextInt();
        if (kanam >= 80) {
            System.out.println("พ่อคนเก่ง A");
        } else if (70 >= kanam && kanam <= 79) {
            System.out.println("ฉลาดหนิได้ B");
        } 
        else if (60 >= kanam && kanam <= 69) {
            System.out.println("เกือบฉลาดได้ C");
        } else if (50 >= kanam && kanam <= 59) {
            System.out.println("เกือบโง่ได้ D");
        } else {
            System.out.println("ติด F ไปดิไอ่โง่");
        }
    }
}
