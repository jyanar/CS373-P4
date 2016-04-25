package cs373.p4.builder;

public class XWingBuilder implements IShipBuilder {
    
    private Spaceship spaceship = new Spaceship();
    private static int counter = 0;
    
    public XWingBuilder() {}
    
    public void beginConstruction() {
        this.spaceship.setId("X-Wing T-65-" + counter);
        this.spaceship.setOccupancy(1);
        this.counter++;
    }
    
    public void constructCockPit() {
        this.spaceship.setCockPit("Faicom XA-LL129");
    }

    public void constructEngine() {
        this.spaceship.setEngine("Incom 4L4 fusial thrust 300 KTU");
    }
    
    public void constructBody() {
        this.spaceship.setBody("Incom 20-RU Titanium Alloy");
    }
    
    public void constructLeftWing() {
        this.spaceship.setLeftWing("S-Foil-L Inertials");
    }
    
    public void constructRightWing() {
        this.spaceship.setRightWing("S-Foil-R Inertials");
    }

    public Spaceship getSpaceShip() {
        return spaceship;
    }
}
