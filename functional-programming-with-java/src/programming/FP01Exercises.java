package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printOddNumbersInListFunctional(numbers);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");
		printAllCoursesInListFunctional(courses);
		printCoursesInListContainingSpringFunctional(courses);
		printCoursesInListContainingAtleastFourLetters(courses);
		
	}

	private static void printCoursesInListContainingAtleastFourLetters(List<String> courses) {
		
		System.out.println("Courses containing atleast 4 letters");
		courses.stream()
		.filter(course -> course.length() >= 4)
		.forEach(System.out::println);
	}

	private static void printCoursesInListContainingSpringFunctional(List<String> courses) {
		
		System.out.println("Courses containing Spring");
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);
	}

	private static void printAllCoursesInListFunctional(List<String> courses) {
		
		System.out.println("All Courses");
		courses.stream()
		.forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		
		System.out.println("Even Numbers");
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.forEach(System.out::println);
	}
}