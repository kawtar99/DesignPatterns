package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxVisitorTest {

    @Test
    public void shouldVisitFood(){
        Visitor taxVisitor = new TaxVisitor();
        Food milk = new Food();
        double tax = milk.accept(taxVisitor);
        assertEquals(tax, 0.5);
    }

    @Test
    public void shouldVisitClothing(){
        Visitor taxVisitor = new TaxVisitor();
        Clothing shirt = new Clothing();

        double tax = shirt.accept(taxVisitor);
        assertEquals(tax, 1.1);
    }

}