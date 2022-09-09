public interface WeatherObserver {
    void update();

    void setProvider(Weather provider);
}
