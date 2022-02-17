package builder;

public class IglooHouseBuilder implements HouseBuilder{

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice basement");
    }

    @Override
    public void buildWalls() {
        house.setWalls(1);
    }

    @Override
    public void buildWindows() {
        house.setWindows(0);
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Cold interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
