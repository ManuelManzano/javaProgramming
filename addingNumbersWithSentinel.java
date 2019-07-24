import java.util.Scanner;

public class Sentinel {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int number = 0, sum = 0;

		System.out.println("Enter your numbers. Enter -999 to QUIT ");
		number = keyboard.nextInt();

		while (number != -999) {

			sum += number;

			System.out.println("Enter your numbers. Enter -999 to QUIT ");
			number = keyboard.nextInt();
		}

		System.out.println("The sum of your numbers is : " + sum);
	}

}
