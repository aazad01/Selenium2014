package month.design;

public class Month {
	EMonth month;
	
	public Month(EMonth month){
		this.month = month;
	}
	
	public void season(){
		switch(month){
		case MARCH:
		case APRIL:
		case MAY:
			System.out.println("Spring!");
			break;
		case JUNE:
		case JULY:
		case AUGUST:
			System.out.println("SUMMER!!!!");
			break;
		case SEPTEMBER:
		case OCTOBER:
		case NOVEMBER:
			System.out.println("Fall!");
			break;
		//case DECEMBER:
		//case JANUARY:
		//case FEBRUARY:
		default:
			System.out.println("Winter!");
		}
	}
}
