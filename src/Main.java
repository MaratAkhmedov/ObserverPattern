import Observers.CurrentWeatherPrinter;
import Observers.Observer;
import Subject.Subject;
import Subject.WeatherData;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        Observer obs1 = new CurrentWeatherPrinter(weatherData);
        Observer obs2 = new CurrentWeatherPrinter(weatherData);
        weatherData.setMeasurements(+35, 100, 600);
    }
}
