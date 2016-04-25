package cs373.p4.builder;

public class BWingBuilder implements IShipBuilder {

	private Spaceship spaceship = new Spaceship();
    private static int counter = 0;

    public BWingBuilder() {}

    public void beginConstruction() {
        this.spaceship.setId("B-Wing/E Fighter E2-" + counter);
        this.spaceship.setOccupancy(1);
        this.counter++;
    }

    public void constructCockPit() {
        this.spaceship.setCockPit("Fabritech Reinforced C-FA12");
    }

    public void constructEngine() {
        this.spaceship.setEngine("S&k hYd-997 Hyperdrive Motivator");
    }
    
    public void constructBody() {
        this.spaceship.setBody("Reinforced Durasteel 60 RU");
    }
    
    public void constructLeftWing() {
        this.spaceship.setLeftWing("Narmox HG.6w L");
    }
    
    public void constructRightWing() {
        this.spaceship.setRightWing("Narmox HG.6w R");
    }

    public Spaceship getSpaceShip() {
        return spaceship;
    }
}