package cs373.p4;

public class XWingBuilder implements IShipBuilder {
    
    private Spaceship spaceship = new Spaceship();
    private static int counter = 0;
    
    public XWingBuilder() {}
    
    public void beginConstruction() {
        this.spaceship.setId("X-Wing FA-" + counter);
        this.spaceship.setOccupancy(1);
        this.counter++;
    }
    
    public void constructCockPit() {
        this.spaceship.setCockPit("Faicom XA-LL129");
    }

    public void constructEngine() {
        this.spaceship.setEngine("Gwuay Lamo");
    }
    
    public void constructBody() {
        this.spaceship.setBody("Incom 20-RU Titanium Alloy");
    }
    
    public void constructLeftWing() {
        this.spaceship.setLeftWing("S-Foil Inertials");
    }
    
    public void constructRightWing() {
        this.spaceship.setRightWing("S-Foil Inertials");
    }

    public Spaceship getSpaceShip() {
        return spaceship;
    }
}
