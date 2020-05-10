package Observers;


public interface Observer {
    /**
     * This method is invocated when the state
     * of the Subject will change
     */
    public void update(double temp, double humidity, double pressure);
}
