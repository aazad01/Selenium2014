package math.problem;

public class PrintNumber {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
		
		/* use a for loop to print 1 to 100 and then store into an array.
		 *then use another for loop to print only odd numbers.Then add the 
		 *total numbers from the array.
		 */
		int[] number = new int[100];
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			number[i-1] = i;
		}
		
		for (int i = 0; i < number.length; i++) {
			if(number[i]%2!=0){
				System.out.println(number[i]);
				//total += number[i];
			}
			total += number[i];
		}
		
		System.out.println("Total: " + total);
		
	}

}
