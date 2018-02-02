package chapter2_self;

/**
 * Created by sony on 18-1-23.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
