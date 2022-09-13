public class Main {
    public static void main(String[] args) {
        CarComposite car = new CarComposite("Audi R8");

        CarComposite engine = new CarComposite("5.2L V10 FSI");
        CarComposite carBody = new CarComposite("Audi R8 Body");

        CarPart wheel1 = new CarPart("Audi R8 Wheels", 2400);
        CarPart wheel2 = new CarPart("Audi R8 Wheels", 2400);
        CarPart wheel3 = new CarPart("Audi R8 Wheels", 2400);
        CarPart wheel4 = new CarPart("Audi R8 Wheels", 2400);

        carBody.addPart(wheel1);
        carBody.addPart(wheel2);
        carBody.addPart(wheel3);
        carBody.addPart(wheel4);

        CarPart door1 = new CarPart("Audi R8 Door", 5000);
        CarPart door2 = new CarPart("Audi R8 Door", 5000);

        carBody.addPart(door1);
        carBody.addPart(door2);

        CarPart piston1 = new CarPart("V10 Piston", 1500);
        CarPart piston2 = new CarPart("V10 Piston", 1500);
        CarPart piston3 = new CarPart("V10 Piston", 1500);
        CarPart piston4 = new CarPart("V10 Piston", 1500);
        CarPart piston5 = new CarPart("V10 Piston", 1500);
        CarPart piston6 = new CarPart("V10 Piston", 1500);

        engine.addPart(piston1);
        engine.addPart(piston2);
        engine.addPart(piston3);
        engine.addPart(piston4);
        engine.addPart(piston5);
        engine.addPart(piston6);

        CarPart sparkPlug1 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug2 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug3 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug4 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug5 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug6 = new CarPart("NGK Spark plug", 80);

        engine.addPart(sparkPlug1);
        engine.addPart(sparkPlug2);
        engine.addPart(sparkPlug3);
        engine.addPart(sparkPlug4);
        engine.addPart(sparkPlug5);
        engine.addPart(sparkPlug6);

        car.addPart(carBody);
        car.addPart(engine);
    

        car.printDetails();
    }
}
