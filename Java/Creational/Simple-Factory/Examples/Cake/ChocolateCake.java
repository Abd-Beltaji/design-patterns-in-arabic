public class ChocolateCake implements Cake {
    private Shape shape;
    private Flavour flavour;

    public ChocolateCake(Shape shape) {
        this.shape = shape;
        this.flavour = Flavour.CHOCOLATE;
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }

    @Override
    public Flavour getFlavour() {
        return this.flavour;
    }

}
