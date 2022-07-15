package veritabani;

import java.util.ArrayList;

public class Nutritionist extends User{
    private String nutritionistId;
    private ArrayList<Appointment> nutAppointments;

    public Nutritionist(String nutritionistId, String firstName, String surname, String password ) {
        super(firstName, surname, password);
        this.nutritionistId = nutritionistId;
        nutAppointments = new ArrayList<>();
    }

    public String getNutritionistId() {
        return nutritionistId;
    }

    public void setNutritionistId(String nutritionistId) {
        this.nutritionistId = nutritionistId;

    }
    
    public boolean searchAppointment(Appointment appointment) {
    	return nutAppointments.contains(appointment);
    }
    
    
    public boolean addAppointment(Appointment appointment) {
    	if(searchAppointment(appointment)) {
    		return nutAppointments.add(appointment);
    	}else 
    		return false;
    }

	public ArrayList<Appointment> getNutAppointments() {
		return nutAppointments;
	}

    
}
