package visitor;

public class TaxVisitor implements Visitor{

    @Override
    public double visit(Food food) {
        return 0.5;
    }

    @Override
    public double visit(Clothing clothing) {
        return 1.1;
    }
}
