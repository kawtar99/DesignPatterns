package visitor;

/**
 * Visitor design pattern can add methods to an already existing class without changing it
 */
public interface Visitor {

    public double visit(Food food);
    public double visit(Clothing clothing);

}
