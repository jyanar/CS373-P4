package cs373.p4.visitor;

//Interface that defines the visitor behavior for all of the different elements(gold, silver, iron)
public interface Elements {
    public void accept(Visitor visitor);
}
