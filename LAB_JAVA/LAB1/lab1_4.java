package Lab1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_4 {
	public static void main(String[] args) {
		Scanner getscore = new Scanner (System.in);
		
	System.out.println("Pls Input Score : ");
	int score = getscore.nextInt();
	
	if (score < 0 || score > 100) {
		System.out.println("คะแนนบ้านพ่อมึงน้อยกว่า 0 เยอะกว่า 100 ");
	}
	else if (score < 50){
		System.out.println("ติดF");
	}
	else if (score >= 50 && score <= 59 ) {
		System.out.println("เกรดD");
	}
	else if (score >= 60 && score <= 69) {
		System.out.println("เกรดC");
	}
	else if (score >= 70 && score <= 79) {
		System.out.println("เกรดB");
	}
	else if (score >= 80 && score <= 100) {
		System.out.println("เกรด A");
	}
	getscore.close();
	}
}
