package com.patterns.strategies.pay;

public interface PayStrategy {
    boolean pay(int payment);
    void collectPaymentDetails();
}
