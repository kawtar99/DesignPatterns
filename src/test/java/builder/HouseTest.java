package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    public void shouldBuildRegularHouse(){
        RegularHouseBuilder regularHouseBuilder = new RegularHouseBuilder();
        Director director = new Director(regularHouseBuilder);

        director.constructHouse();

        House regularHouse = director.getHouse();

        assertEquals(regularHouse.getBasement(), "Concrete basement" );
        assertEquals(regularHouse.getWalls(), 4);
        assertEquals(regularHouse.getWindows(), 4);
        assertEquals(regularHouse.getRoof(),"Concrete roof" );
        assertEquals(regularHouse.getInterior(),"Regular interior" );
    }

    @Test
    public void shouldBuildIglooHouse(){
        IglooHouseBuilder iglooHouseBuilder = new IglooHouseBuilder();
        Director director = new Director(iglooHouseBuilder);

        director.constructHouse();

        House iglooHouse = director.getHouse();

        assertEquals(iglooHouse.getBasement(), "Ice basement" );
        assertEquals(iglooHouse.getWalls(), 1);
        assertEquals(iglooHouse.getWindows(), 0);
        assertEquals(iglooHouse.getRoof(),"Ice roof" );
        assertEquals(iglooHouse.getInterior(),"Cold interior" );
    }

}