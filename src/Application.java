import java.util.Scanner;


public class Application {

	
	public static void main(String[] args) {
		// create array numbers
		int[] numbers;
		numbers = new int[5];
		
		Calculations calc = new Calculations();
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter lottery number: ");
			numbers[i] = input.nextInt();
		}
		
		input.close();
		
		calc.max(numbers);
		
		System.out.println("Program is terminating. Thank you!");
	}

}
