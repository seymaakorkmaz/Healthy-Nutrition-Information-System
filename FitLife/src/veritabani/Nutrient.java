package veritabani;

public class Nutrient {
    private String name;
    private int calorie;
    private int type;  //1 : karbonhidrat , 2 : yað, 3 : protein , 4 : meyve sebze  , 5 : içecek
    private int fat;
    private int carbs;
    private int fiber;
    private int protein;
    private int repast; // 1 :  kahvaltý , 2 : öðle yemeði , 3 : akþam yemeði
    private int number; 
    
	public Nutrient(String name, int calorie, int fat, int carbs, int protein, int fiber, int type) {
		super();
		this.name = name;
		this.calorie = calorie;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
		this.fiber = fiber;
		this.setType(type);
	}
	public Nutrient() {
	
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCalorie() {
		return calorie;
	}
	
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getCarbs() {
		return carbs;
	}
	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}
	public int getFiber() {
		return fiber;
	}
	public void setFiber(int fiber) {
		this.fiber = fiber;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getRepast() {
		return repast;
	}

	public void setRepast(int repast) {
		this.repast = repast;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
    
    
}
