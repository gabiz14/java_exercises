public class MySecondApp {

	public static void main (String[] args) {
		int x = 1;
		System.out.println("Before the loop");
		while (x < 4) {
			System.out.println("In the loop");
			System.out.println("value of x is " + x);
			x = x + 1;
		}
		System.out.println("After the loop");
	}
}