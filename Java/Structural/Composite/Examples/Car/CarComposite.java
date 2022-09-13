import java.util.ArrayList;
import java.util.List;

public class CarComposite implements CarElement {
    String model;
    List<CarElement> parts;

    public CarComposite(String model) {
        parts = new ArrayList<>();
        this.model = model;
    }

    String getModel() {
        return this.model;
    }

    void addPart(CarElement part) {
        this.parts.add(part);
    }

    public float getPrice() {
        float price = 0;
        for (CarElement p : parts)
            price += p.getPrice();
        return price;
    }

    public void printDetails() {
        System.out.println("The part Model: (" + this.model + "), price (" + this.getPrice() + ")");
        if (!parts.isEmpty()) {
            System.out.println("It has the following sub-parts: ");
            for (CarElement p : parts)
                p.printDetails();
        }
        System.out.println("================================");
    }
}
