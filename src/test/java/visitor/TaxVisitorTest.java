package visitor;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TaxVisitorTest {

    @Test
    public void shouldVisitFood(){
        Visitor taxVisitor = new TaxVisitor();
        Food milk = new Food();
        milk.setPrice(10);
        double tax = milk.accept(taxVisitor);
        assertEquals(tax, 5);
    }

    @Test
    public void shouldVisitClothing(){
        Visitor taxVisitor = new TaxVisitor();
        Clothing shirt = new Clothing();
        shirt.setPrice(25);
        double tax = shirt.accept(taxVisitor);
        assertEquals(tax, 1.1*25);

    }

}