package month.design;

public class ApplyEnum {

	/**
	 * Please design the following Feature in java.
	 */
	public static void main(String[] args) {
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */
		Month month1 = new Month(EMonth.JANUARY);
		month1.season();
		
		Month month7 = new Month(EMonth.JULY);
		month7.season();
	}

}
