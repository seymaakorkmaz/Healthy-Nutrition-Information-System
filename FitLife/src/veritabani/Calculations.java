package veritabani;

public class Calculations {
	private double age;
	private double weight;
	private double height;
	private double activities;
	private double aim;
	private double gender;
	
	
	
	public Calculations() {
		super();
	}
	
	
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getGender() {
		return gender;
	}
	public void setGender(double gender) {
		this.gender = gender;
	}
	public double getActivities() {
		return activities;
	}
	public void setActivities(double activities) {
		this.activities = activities;
	}
	public double getAim() {
		return aim;
	}
	public void setAim(double aim) {
		this.aim = aim;
	}
	public double basalMethabolism(double weight,double height,double age,double gender) {
		if(gender==0) {
			return (655.1 + (9.56 * weight) + (1.85 * height) - (4.68 *age));
		}else {
			return (66.5+(13.75)*weight+(5.03)*height-(6.75*age));
		}			
	}
	public double bodyMassIndex(double weight,double height) {
		double h = height/100;
		return weight/((h)*(h));
				
	}
	
	public double idealCalorie(double weight,double h,double age,double activities,double aim,double gender) {
		return basalMethabolism(weight, h, age, gender)*(activities)*((7+aim)/10);
				
	}
	
	public double idealCarb(double weight,double height,double age,double activities,double aim,double gender) {
		return idealCalorie(weight, height, age, activities, aim, gender)*0.55;
				
	}
	
	public double idealProtein(double weight,double height,double age,double activities,double aim,double gender) {
		return  idealCalorie(weight, height, age, activities, aim, gender)*0.15;
				
	}
	
	public double idealFat(double weight,double height,double age,double activities,double aim,double gender) {
		return idealCalorie(weight, height, age, activities, aim, gender)*0.3;	
	}
}