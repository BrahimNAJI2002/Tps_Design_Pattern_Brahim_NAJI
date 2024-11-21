package org.example;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(30);
        Observer observer1 =new ObserverImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverImpl2());
        observable.setState(10);
        observable.setState(80);
        observable.setState(100);
        observable.unsubscribe(observer1);
        observable.setState(21);


        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("-------------------");
                System.out.println("Prévision = "+Math.cos(state*2.55)*Math.log(state*state));
                System.out.println("-------------------");
            }
        });


        observable.subscribe((state) -> {
            System.out.println("-------------------");
            System.out.println("Tendance => "+((state>50)?"Positif":"Negatif"));
            System.out.println("-------------------");

        });


        observable.setState(20);
        observable.setState(44);
    }


}
