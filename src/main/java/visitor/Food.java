package visitor;

import java.security.PrivateKey;

public class Food implements Visitable{

    private String name;
    private double price;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
