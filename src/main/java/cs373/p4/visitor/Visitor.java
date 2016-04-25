package cs373.p4.visitor;

//Interface which provides the different kinds of elements
public interface Visitor {
    public void visit(Gold gold);
    public void visit(Silver silver);
    public void visit(Iron iron);
}
