public class Main {
    public static void main(String[] args) {

        Polygon shape1 = ShapeFactory.getInstance(2);
        Polygon shape2 = ShapeFactory.getInstance(3);
        Polygon shape3 = ShapeFactory.getInstance(4);

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
