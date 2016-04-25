package cs373.p4;

public class Main {
	public static void main(String[] args) {
		ShipDirector sd = new ShipDirector();
		IShipBuilder xwb = new XWingBuilder();
		// IShipBuilder awb = new AWingBuilder();

		sd.makeShip(xwb);
		Spaceship ss = xwb.getSpaceShip();
		System.out.println(ss.toString());
		
	}
}
