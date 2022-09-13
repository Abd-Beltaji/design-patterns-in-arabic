public class CatAdapter implements Felidae {
    private Cat cat;

    public CatAdapter(Cat cat){
        this.cat = cat;
    }
    public void roar(){
        this.cat.meow();
    }
}
