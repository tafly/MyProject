public class Calculations {
	void max(int[] numbers) {
		// create max variable which will store highest number
		int max = 0;
		
		// loop through the values in numbers[] array
		for (int i = 0; i < 5; i++) {
			if (numbers[i] > max) max = numbers[i];
		}
		
		// print out the highest number
		System.out.printf("Max number is %d \n", max);
	}
	
	void lowest(int[] numbers) {
		// create max variable which will store lowest number
		int lowest = numbers[0];
		
		// loop through the values in numbers[] array
		for (int i = 0; i < 5; i++) {
			if (numbers[i] < lowest) lowest = numbers[i];
		}
		
		// print out the highest number
		System.out.printf("Lowest number is %d \n", lowest);
	}
}
