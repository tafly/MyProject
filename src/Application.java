import java.util.Scanner;


public class Application {

	static void max(int[] numbers) {
		// create max variable which will store highest number
		int max = 0;
		
		// loop through the values in numbers[] array
		for (int i = 0; i < 5; i++) {
			if (numbers[i] > max) max = numbers[i];
		}
		
		// print out the highest number
		System.out.printf("Max number is %d \n", max);
	}
	
	
	public static void main(String[] args) {
		// create array numbers
		int[] numbers;
		numbers = new int[5];
		
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter lottery number: ");
			numbers[i] = input.nextInt();
		}
		
		input.close();
		
		max(numbers);
		
		System.out.println("Program is terminating. Thank you!");
	}

}
