package cs373.p4.builder;

public class Spaceship implements ISpaceship {

	private String id;
	private String leftWing;
	private String rightWing;
	private String engine;
	private String cockPit;
	private int occupancy;
	private String body;

	public Spaceship() {}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getEngine() {
		return engine;
	}

	public void setLeftWing(String leftWing) {
		this.leftWing = leftWing;
	}
	public String getLeftWing() {
		return leftWing;
	}

	public void setRightWing(String rightWing) {
		this.rightWing = rightWing;
	}
	public String getRightWing() {
		return rightWing;
	}

	public void setCockPit(String cockPit) {
		this.cockPit = cockPit;
	}
	public String getCockPit() {
		return cockPit;
	}

	public void setBody(String body) {
		this.body = body;
	}
	public String getBody() {
		return body;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	public int getOccupancy() {
		return occupancy;
	}

	@Override public String toString() {
		return id + ":\n\tCockpit: " + cockPit + "\n\tBody: " + body +
		       "\n\tEngine: " + engine + "\n\tRight Wing: " + rightWing +
		       "\n\tLeft Wing: " + leftWing + "\n\tOccupancy: " + occupancy;
	}
}

