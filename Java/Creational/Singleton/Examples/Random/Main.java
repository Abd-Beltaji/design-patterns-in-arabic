package Java.Creational.Singleton.Examples.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = Random.getInstance();
        System.out.println(rand.getRandInteger(1, 5));
        System.out.println(rand.getRandInteger(8, 50));
        System.out.println(rand.getRandInteger(7, 9));
        System.out.println(rand.getRandInteger(-50, 50));
    }
}
