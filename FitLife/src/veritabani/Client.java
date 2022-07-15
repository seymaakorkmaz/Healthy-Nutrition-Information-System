package veritabani;
import java.util.ArrayList;
import java.util.regex.*;

public class Client extends User{
    private String username;
    private String e_mail;
    private String phoneNumber;
    private int gender; // 0 : female , 1 : male , 2 : other
    private int age;
    private ArrayList<Appointment> appointments;
    private DietList dietList = new DietList();
    
    public Client() {
		appointments = new ArrayList<>();
	}
    
    public Client(String firstName, String surname,String username, String password, String e_mail, String phoneNumber, int gender, int age) {
        super(firstName, surname,password);
        this.phoneNumber = phoneNumber;
        this.e_mail = e_mail;
        this.username = username;
        this.gender = gender;
        this.age = age;
    }
    
    public boolean isThereCharacter(String num) {
    	for(int i = 0 ; i< num.length(); i++)
    		if(num.charAt(i) < '0' || num.charAt(i) > '9') {
    			return true;
    		}
    	return false;
    }

    public boolean isAgeValid(int age){
        if(age > 0 && age < 120 )
            return true;
        else
            return false;
    }
    
    public boolean isStringEmpty(String string) {
    	return string.equals("");
    }

    public boolean isPhoneValid(String phoneNumber){
        if(phoneNumber.length() == 11) {
            for(int i = 0; i < 11 ; i++)
                if(phoneNumber.charAt(i) > '9')
                    return false;
            return true;
        }
        else
            return false;
    }

    public boolean isEMailValid(String e_mail){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(e_mail);
        if(matcher.matches())
            return true;
        else
            return false;
    }

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;

    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
	}

	public DietList getDietList() {
		return dietList;
	}

	public void setDietList(DietList dietList) {
		this.dietList = dietList;
	}
}
