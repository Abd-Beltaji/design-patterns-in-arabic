public class CarPart implements CarElement{
    String model;
    float price;

    public CarPart(String model, float price) {
        this.model = model;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    public float getPrice() {
        return this.price;
    }

    public void printDetails() {
        System.out.println("The part Model: (" + this.model + "), price (" + this.getPrice() + ")");
    }
}
