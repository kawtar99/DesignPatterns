package visitor;

public class TaxVisitor implements Visitor{

    @Override
    public double visit(Food food) {
        return food.getPrice() * 0.5;
    }

    @Override
    public double visit(Clothing clothing) {
        return clothing.getPrice() * 1.1;
    }
}
