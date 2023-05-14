package com.patterns.strategies.pay;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPaypal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;
    static {
        DATA_BASE.put("amanda1985","amanda@ya.com");
        DATA_BASE.put("qwerty","john@amazon.eu");
    }
    @Override
    public boolean pay(int payment) {
        return false;
    }

    @Override
    public void collectPaymentDetails() {

    }
}
