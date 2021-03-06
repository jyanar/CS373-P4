package cs373.p4.visitor;

//This class contains the functionality of each of the element classes
public class ElementVisitor implements Visitor{
    private double totalValue;
    
    public void visit(Gold gold){
        totalValue += 1320 * gold.getWeight();
    }
    
    public void visit(Silver silver){
        totalValue += 20 * silver.getWeight();
    }
    
    public void visit(Iron iron){
        totalValue += .0025 * iron.getWeight();
    }
    
    public double getTotalValue(){
        return totalValue;
    }
}
