package Java.Behavioural.Observer.Examples.Weather;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather = WeatherType.NORMAL;
    public final List<WeatherObserver> observers;

    public Weather() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(WeatherObserver observer) {
        this.observers.add(observer);
        observer.setProvider(this);
    }

    public void setWeather(WeatherType type) {
        this.currentWeather = type;
        for(WeatherObserver observer : this.observers){
            observer.update();
        }
    }

    public WeatherType getWeather() {
        return this.currentWeather;
    }
}
