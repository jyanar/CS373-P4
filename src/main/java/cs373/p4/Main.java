package cs373.p4;

import cs373.p4.visitor.*;
import cs373.p4.builder.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("************** VISITOR PATTERN **************");

        MineCart myCart = new MineCart();
        
        Gold gold = new Gold();
        gold.setWeight(10);
        
        Silver silver = new Silver();
        silver.setWeight(20);
        
        Iron iron = new Iron();
        iron.setWeight(30);
        
        myCart.elements.add(gold);
        myCart.elements.add(silver);
        myCart.elements.add(iron);
        
        double total = myCart.calculateValue(); // Visiting all elements
        System.out.println("The Value of your cart is " + total + ".");

        System.out.println("************** BUILDER PATTERN **************");

        ShipDirector sd = new ShipDirector();
        IShipBuilder xwb = new XWingBuilder();
        IShipBuilder awb = new AWingBuilder();
        IShipBuilder bwb = new BWingBuilder();

        sd.makeShip(xwb);
        Spaceship xwing1 = xwb.getSpaceShip();
        sd.makeShip(xwb);
        Spaceship xwing2 = xwb.getSpaceShip();

        sd.makeShip(awb);
        Spaceship awing = awb.getSpaceShip();
        
        sd.makeShip(bwb);
        Spaceship bwing = bwb.getSpaceShip();

        System.out.println(xwing1.toString() + "\n");
        System.out.println(xwing2.toString() + "\n");
        System.out.println(awing.toString() + "\n");
        System.out.println(bwing.toString() + "\n");        
    }
}
