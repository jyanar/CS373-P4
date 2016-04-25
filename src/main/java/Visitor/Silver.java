package Visitor;

public class Silver implements Elements {
	private double weight;
	
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double x){
		weight = x;
	}
}
