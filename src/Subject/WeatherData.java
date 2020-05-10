package Subject;

import Observers.Observer;
import Subject.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pression;
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
        temperature = 0.0;
        humidity = 0.0;
        pression = 0.0;
    }


   public void setMeasurements(double temp, double humidity, double pres) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pression = pres;
        notifyObservers();
   }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject.WeatherData{");
        sb.append("temperature=").append(temperature);
        sb.append(", humidity=").append(humidity).append("%");
        sb.append(", pression=").append(pression);
        sb.append('}');
        return sb.toString();
    }


    /**
     * add this Observer to the list of observers of the subject
     *
     * @param observer the observer of the subject
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * notify all observers that we state of the Subject.Subject have changed
     * changes in the subject
     */
    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(temperature, humidity, pression);
        }
    }

    /**
     * Remove observer, after that the observer will not receive all
     *
     * @param observer delete observer from the subject
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
