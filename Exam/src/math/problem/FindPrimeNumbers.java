package math.problem;

public class FindPrimeNumbers {

	/**
	 * Please do the flowing problem.
	 */
	public static void main(String[] args) {
	
		/* Find the prime numbers from 1 to 1000 then print to console.
	(prime numbers are only divisible by number 1 and the number itself.)
	(for example numbers like 2,3,5,7,9,11,13.....n are prime numbers. 
		*/
		int limit = 1000;
		boolean isPrime;
		System.out.println("1\n2");
		for(int i = 3; i <= limit; i++){
			//Go over only odd numbers
			isPrime = true;
			if(i%2==1)
			{
				//Go throw every number between 2 till the number and check if it's divisible.
				for(int j = 2; j < i; j++){
					if(i%j==0){
						//factoral is found.
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					System.out.println(i);
				}
			}
		}

	}

}
