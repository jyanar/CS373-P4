package cs373.p4.builder;

public interface IShipBuilder {
    
    public void beginConstruction();
    public void constructCockPit();
    public void constructEngine();
    public void constructBody();
    public void constructLeftWing();
    public void constructRightWing();
    public Spaceship getSpaceShip();
    
}
