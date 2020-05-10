package Subject;

import Observers.Observer;

public interface Subject {
    /**
     * add this Observer to the list of observers of the subject
     * @param observer the observer of the subject
     */
    public void registerObserver(Observer observer);

    /**
     * notify all observers that we state of the Subject.Subject have changed
     * changes in the subject
     */
    public void notifyObservers();

    /**
     *  Remove observer, after that the observer will not receive all
     * @param observer delete observer from the subject
     */
    public void removeObserver(Observer observer);
}
