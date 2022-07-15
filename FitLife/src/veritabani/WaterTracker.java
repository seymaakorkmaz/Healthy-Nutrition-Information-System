package veritabani;

public class WaterTracker {
	Client client;
	int waterTarget;
	int glassNum;
	
	public WaterTracker(Client client, int waterTarget, int glassNum) {
		super();
		this.client = client;
		this.waterTarget = waterTarget;
		this.glassNum = glassNum;
	}

	public WaterTracker(Client client, int waterTarget) {
		super();
		this.client = client;
		this.waterTarget = waterTarget;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getWaterTarget() {
		return waterTarget;
	}

	public void setWaterTarget(int waterTarget) {
		this.waterTarget = waterTarget;
	}

	public int getGlassNum() {
		return glassNum;
	}

	public void setGlassNum(int glassNum) {
		this.glassNum = glassNum;
	}
}
