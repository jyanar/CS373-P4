package Visitor;

public class Main {

	public static void main(String[] args) {
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
		
		double total = myCart.calculateValue();
		System.out.println("The Value of your cart is " + total + ".");

	}

}
