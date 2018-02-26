package clock;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock {
	private int hour, minute, second;
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void tick() {
		second = second+1;
	}
	public void commence() throws InterruptedException {
		for(int i = 0; i < 1000; i++) {
			System.out.println(hour + ":" + minute + ":" + second);
			tick();
			Thread.sleep(1000);
		}
	}

}
