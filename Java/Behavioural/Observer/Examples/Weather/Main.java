public class Main {
    public static void main(String[] args) {
        Weather weatherProvider = new Weather();

        Application myApplication = new Application();

        weatherProvider.subscribe(myApplication);

        weatherProvider.setWeather(WeatherType.CLOUDY);
        weatherProvider.setWeather(WeatherType.RAINY);
        weatherProvider.setWeather(WeatherType.STORMY);
        weatherProvider.setWeather(WeatherType.SUNNY);
    }
}
