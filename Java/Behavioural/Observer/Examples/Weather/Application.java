package Java.Behavioural.Observer.Examples.Weather;

public class Application implements WeatherObserver {
    private Weather provider;

    @Override
    public void update() {
        System.out.println("The Weather has changed to: " + this.provider.getWeather());
    }

    @Override
    public void setProvider(Weather provider) {
        this.provider = provider;
    }
}
