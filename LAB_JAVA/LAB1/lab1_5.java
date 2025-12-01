package Lab1;
import java.util.Scanner;
public class Lab1_5 {
	public static void main(String[] args){
		
		System.out.println("1 = Americano");
		System.out.println("2 = Latte");
		System.out.println("3 = Espresso");
		System.out.println("4 = Mocha");
		
		System.out.print("Enter you menu : ");
		Scanner menu = new Scanner(System.in);
		
		int memuchoice = menu.nextInt();
		
		
		if (memuchoice < 1 || memuchoice > 4) {
            System.out.println("Error: Invalid Menu");
        }
		else if (memuchoice == 1) {
            System.out.println("You menu is Americano");
        }
        else if (memuchoice == 2) {
            System.out.println("You menu is Latte");
        }
        else if (memuchoice == 3) {
            System.out.println("You menu is Espresso");
        }
        else if (memuchoice == 4) {
            System.out.println("You menu is Mocha");
        }

		menu.close();
	}
}
