package cs373.p4.builder;

public class ShipDirector {
    
    public ShipDirector() {}
    
    public void makeShip(IShipBuilder shipBuilder) {
        shipBuilder.beginConstruction();
        shipBuilder.constructCockPit();
        shipBuilder.constructBody();
        shipBuilder.constructEngine();
        shipBuilder.constructLeftWing();
        shipBuilder.constructRightWing();
    }
}