public class VanillaCake implements Cake {
    private Shape shape;
    private Flavour flavour;

    public VanillaCake(Shape shape) {
        this.shape = shape;
        this.flavour = Flavour.VANILLA;
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
