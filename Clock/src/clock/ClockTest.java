package clock;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockTest {

	public static void main(String[] args) throws InterruptedException {
		Calendar cal = new GregorianCalendar();
		Clock clock1 = new Clock(cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
		clock1.commence();
	}

}
