package collectionsPractice.Java8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    private String pastDate;
	private String currentDate = "";

	public String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date today = new Date();
        currentDate =sdf.format(today);
	    return currentDate;
	}
	
	public String getPastDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, Integer.parseInt("-15")); // subtracting the 15 years to the current year
        Date dt = cal.getTime();
        pastDate = sdf.format(dt);
		return pastDate;
	}

    public static void main(String[] args) {

        System.out.println(new CalendarTest().getCurrentDate());
        System.out.println(new CalendarTest().getPastDate());
    
    }
    
}