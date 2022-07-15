package veritabani;

import java.util.ArrayList;

public class DietList {
	private ArrayList<Nutrient> nutrients;
	
	public DietList() {
		this.nutrients = new ArrayList<>();
	}
	
	public ArrayList<Nutrient> getNutrients() {
		return nutrients;
	}

	public void setNutrients(ArrayList<Nutrient> nutrients) {
		this.nutrients = nutrients;
	}

}
