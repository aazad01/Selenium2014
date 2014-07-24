package random.number;

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 * 
	 */
	public static void main(String[] args) {
	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   */
		
		int[] number = new int[50];
		for(int i = 0; i < number.length; i++){
			number[i] = (int)(Math.random() * 501);
		}
		
		for (int i = 0; i < number.length; i++) {
			if (number[i]%2==0) {
				System.out.println(number[i]);
			}
		}

	}

}
