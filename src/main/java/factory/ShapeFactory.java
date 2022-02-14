package factory;

public class ShapeFactory {

    public static Shape createShape(String type){
        switch (type){
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            default:
                return null;
        }
    }
}
