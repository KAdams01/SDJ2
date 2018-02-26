package clock;

public class Clock {
	int hour, minute, second;
	
	public Clock()
	{
	}
	public void set(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}
