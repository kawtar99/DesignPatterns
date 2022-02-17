package builder;

public class RegularHouseBuilder implements HouseBuilder{

    private House house;

    public RegularHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Concrete basement");
    }

    @Override
    public void buildWalls() {
        house.setWalls(4);
    }

    @Override
    public void buildWindows() {
        house.setWindows(4);
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Regular interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
