public class BottleSong {
	public static void main (String[] args) {
		int bottleNum = 99;
		String word = "green bottles";

		while(bottleNum > 0) {
			System.out.println("There was" + " " + bottleNum + " " + word + " " + "sitting on the wall");
			System.out.println("Then one fell off!");
			bottleNum = bottleNum - 1;
			System.out.println("There are now" + " " + bottleNum + " " + word + " " + "left!");


			if (bottleNum == 1) {
				word = " green bottle"; // only one left now
			}
	  	}
	}
}