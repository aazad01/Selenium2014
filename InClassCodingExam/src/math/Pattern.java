package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32
		 * 
		 * My output:
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32,28,24,20,16,12,8,4,
		 */
		int number = 100;
		int sub = 1;
		int counter = 1;
		while(number>0){
			System.out.print(number + ",");
			number -= sub;
			
			if(counter==10){
				counter=0;
				sub++;
			}
			
			counter++;
		}

	}

}
