public class Main {
    public static void main(String[] args) {
        Cake myChocolateCake = CakeFactory.makeCake(Flavour.CHOCOLATE, Shape.CIRCULAR);
        Cake myVanillaCake = CakeFactory.makeCake(Flavour.VANILLA, Shape.RECTANGULAR);

        System.out.println("The shape of the " +
                myChocolateCake.getFlavour() +
                " cake is " +
                myChocolateCake.getShape());

        System.out.println("The shape of the " +
                myVanillaCake.getFlavour() +
                " cake is " +
                myVanillaCake.getShape());
    }
}