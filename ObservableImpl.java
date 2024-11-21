package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private  int state = 0;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(state);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
