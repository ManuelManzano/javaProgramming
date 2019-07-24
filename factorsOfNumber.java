import java.util.Scanner;
public class Factors {


	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		int number, factor;
		
		System.out.println("Enter an integeer: ");
		number = keyboard.nextInt();
		
		for (factor = 1; factor <= number; factor++) {
			
			if (number % factor == 0) {
			
			System.out.println(factor + " is a factor of 12");
			}
		}

	}

}
