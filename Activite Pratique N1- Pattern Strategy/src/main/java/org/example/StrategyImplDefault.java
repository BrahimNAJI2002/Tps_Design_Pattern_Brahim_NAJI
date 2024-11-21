package org.example;

public class StrategyImplDefault implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("========= Default Strategy =========");
    }
}
