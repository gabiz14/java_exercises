import java.io.Console;

public class MyIfApp {
	public static void main (String[] args) {
		Console console = System.console();

		String ageAsString = console.readLine("How old are you?  ");
		int age = Integer.parseInt(ageAsString);
		System.out.println(age);
		if (age >= 18) {
			System.out.println("Have a beer!");
		} else {
			System.out.println("Have a juice!")
		}
	}
}