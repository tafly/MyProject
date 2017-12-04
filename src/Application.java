import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		int[] numbers;
		numbers = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter lottery number: ");
			numbers[i] = input.nextInt();
		}
		
		
		input.close();
		System.out.println("Program is terminating. Thank you!");
	}

}
