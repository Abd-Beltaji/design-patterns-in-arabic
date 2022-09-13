public class Main {
    public static void main(String[] args) {
        Felidae lion = new Lion();
        Felidae tiger = new Tiger();
        Felidae cat = new CatAdapter(new Cat());

        lion.roar();
        tiger.roar();
        cat.roar();
    }
}
