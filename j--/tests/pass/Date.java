package pass;
import java.lang.Integer;
public class Date {

	public static String[] MONTHS = new String[] { "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December" };

	public String date(String d) {
		
		// [0-9]{4}-[0-9]{2}-[0-9]{2}
		int year = Integer.parseInt(d.substring(0, 4));
		int monthNb = Integer.parseInt(d.substring(5, 7));
		int day = Integer.parseInt(d.substring(8, 10));
		if (day <= 31 && day > 0 && monthNb <= 12 && monthNb > 0 && 0 <= year) {		
			String month = MONTHS[monthNb - 1];
	
			return month + " " + day + ", " + year;
		}
		return null;
	}

}