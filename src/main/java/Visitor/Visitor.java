package Visitor;

public interface Visitor {
	public void visit(Gold gold);
	public void visit(Silver silver);
	public void visit(Iron iron);
}
