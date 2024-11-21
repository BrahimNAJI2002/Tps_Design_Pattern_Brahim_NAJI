import obs.ObservableImpl;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(30);
        observable.subscribe(new ObserverImpl1());
        observable.subscribe(new ObserverImpl2());
        observable.setState(10);
        observable.setState(80);
        observable.setState(100);
    }


}
