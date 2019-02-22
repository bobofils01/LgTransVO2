package pass;
import java.lang.Integer;

public class Date {

	public static String[] MONTHS = new String[] { "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December" };

	public String date(String d) {
		int year = Integer.parseInt(d.substring(0, 4));
		if(!(d.charAt(4) == '-'))
			return null;
		int monthNb = Integer.parseInt(d.substring(5, 7));
		if(!(d.charAt(7) == '-'))
			return null;
		int day = Integer.parseInt(d.substring(8, 10));
		
		if (day <= 31 && day > 0 && monthNb <= 12 && monthNb > 0 && 0 <= year) {		
			String month = MONTHS[monthNb - 1];
	
			return month + " " + day + ", " + year;
		}
		return null;
	}

}