public class ShapeFactory {
    public static Polygon getInstance(int numberOfVert) throws IllegalArgumentException {
        switch (numberOfVert) {
            case 2:
                return new Line();
            case 3:
                return new Triangle();
            case 4:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Invalid number of vertices");
        }
    }
}
