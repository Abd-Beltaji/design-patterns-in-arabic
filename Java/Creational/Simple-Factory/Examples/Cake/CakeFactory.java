public class CakeFactory {
    public static Cake makeCake(Flavour flavour, Shape shape) {
        switch (flavour) {
            case CHOCOLATE:
                return new ChocolateCake(shape);
            case VANILLA:
                return new VanillaCake(shape);
            default:
                return null;
        }
    }
}
