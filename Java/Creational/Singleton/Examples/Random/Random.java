package Java.Creational.Singleton.Examples.Random;

public class Random {
    private int seed = 0;
    private static Random instance;

    private Random() {
    } // Empty private Constructor

    public int getRandInteger(int from, int to) {
        // Pseudorandom-number-generator
        this.seed++;
        float a = seed * 15485863;
        float v = (a * a * a % 2038074743) / 2038074743;
        return (int) (v * (to - from) + from);
    }

    public static Random getInstance() {
        if (instance == null)
            instance = new Random();
        return instance;
    }
}