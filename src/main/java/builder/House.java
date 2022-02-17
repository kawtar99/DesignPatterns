package builder;

public class House implements HousePlan{

    private String basement;
    private int walls;
    private int windows;
    private String roof;
    private String interior;


    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setWalls(int nbWalls) {
        this.walls = nbWalls;
    }

    @Override
    public void setWindows(int nbWindows) {
        this.windows = nbWindows;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getBasement() {
        return basement;
    }

    public int getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }
}
