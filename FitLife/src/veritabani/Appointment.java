package veritabani;

public class Appointment {
	
	private String date;
	private String hour;
	private Nutritionist nutritionist;
	private Client client;
	
	public Appointment(String date,String hour,Client client, Nutritionist nutritionist) {
		super();
		this.date = date;
		this.nutritionist = nutritionist;
		this.client = client;
		this.hour = hour;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public Nutritionist getNutritionist() {
		return nutritionist;
	}
	
	public void setNutritionist(Nutritionist nutritionist) {
		this.nutritionist = nutritionist;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
}
