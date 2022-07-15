package veritabani;

public class SleepTracker {
	Client client;
	int sleepTarget;
	int tracker;
	int hour;
	
	public SleepTracker(Client client, int sleepTarget) {
		super();
		this.client = client;
		this.sleepTarget = sleepTarget;
	}
	
	
	public SleepTracker(Client client, int sleepTarget, int tracker, int hour) {
		super();
		this.client = client;
		this.sleepTarget = sleepTarget;
		this.tracker = tracker;
		this.hour = hour;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getSleepTarget() {
		return sleepTarget;
	}
	public void setSleepTarget(int sleepTarget) {
		this.sleepTarget = sleepTarget;
	}
	public int getTracker() {
		return tracker;
	}
	public void setTracker(int tracker) {
		this.tracker = tracker;
	}
	
}
