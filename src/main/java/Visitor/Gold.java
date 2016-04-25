package Visitor;

public class Gold implements Elements {
	private double weight;
	
	public Gold(){
		
	}
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
