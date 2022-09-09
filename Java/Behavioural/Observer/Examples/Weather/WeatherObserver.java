package Java.Behavioural.Observer.Examples.Weather;

public interface WeatherObserver {
    void update();

    void setProvider(Weather provider);
}
