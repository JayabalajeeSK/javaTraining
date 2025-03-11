package com.jb.T16ExceptionHandling;

class CurrenciesDoNotMatchException extends Exception {
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }
}

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws CurrenciesDoNotMatchException {
        if (!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies Don't Match: " + this.currency + " and " + that.currency);
        }
        this.amount += that.amount;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) {
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);
        
        try {
            amount1.add(amount2);
            System.out.println(amount1);
        } catch (CurrenciesDoNotMatchException e) {
            e.printStackTrace();
        }
    }
}
// Exception in thread "main" java.lang.UnsupportedOperationException: Unimplemented method 'add'
//         at javaTraining/com.jb.T16ExceptionHandling.Amount.add(Amount.java:14)
//         at javaTraining/com.jb.T16ExceptionHandling.ThrowingExceptionRunner.main(ThrowingExceptionRunner.java:37)