package Visitor;

import java.util.ArrayList;
import java.util.List;

public class MineCart {
	public List<Elements> elements = new ArrayList<Elements>();
	
	public double calculateValue(){
		ElementVisitor visitor = new ElementVisitor();
		
		for(Elements element: elements){
			element.accept(visitor);
		}
		
		double totalValue = visitor.getTotalValue();
		return totalValue;
	}
}
