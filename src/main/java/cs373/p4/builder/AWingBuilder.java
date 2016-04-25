package cs373.p4.builder;

public class AWingBuilder implements IShipBuilder {
    
    private Spaceship spaceship = new Spaceship();
    private static int counter = 0;

    public AWingBuilder() {}

    public void beginConstruction() {
        this.spaceship.setId("RZ-1 A-Wing AW-" + counter);
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
        this.spaceship.setLeftWing("Titanium T3-L Compacts");
    }
    
    public void constructRightWing() {
        this.spaceship.setRightWing("Titanium T3-R Compacts");
    }

    public Spaceship getSpaceShip() {
        return spaceship;
    }
}