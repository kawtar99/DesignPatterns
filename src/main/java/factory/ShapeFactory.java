package factory;

/**
 * In Factory pattern,
 * we create object without exposing the creation logic to the client
 * and refer to newly created object using a common interface
 */
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
