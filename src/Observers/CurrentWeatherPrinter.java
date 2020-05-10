package Observers;

import Subject.Subject;

public class CurrentWeatherPrinter implements Display, Observer{
    private double temp;
    private double humidity;
    private double pression;
    private Subject weatherData;

    public CurrentWeatherPrinter(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * display the data in the console
     */
    @Override
    public void display() {
        System.out.println(
                "Current weather: \nTemperature:" + temp +
                "\nHumidity" + humidity + " %" +
                "\nPressure: " + pression
        );
    }

    /**
     * This method is invocated when the state
     * of the Subject will change
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pression = pressure;
        display();
    }
}
