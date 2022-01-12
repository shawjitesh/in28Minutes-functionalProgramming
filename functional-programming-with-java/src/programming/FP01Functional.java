package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
		
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		System.out.println("Even Numbers");
		numbers.stream()
		.filter(number -> number % 2 == 0)
		.forEach(System.out::println);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		System.out.println("All Numbers");
		numbers.stream()
		.forEach(System.out::println);
	}
}
