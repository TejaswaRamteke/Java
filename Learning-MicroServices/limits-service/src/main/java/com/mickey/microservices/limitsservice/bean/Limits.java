package com.mickey.microservices.limitsservice.bean;

public class Limits {

    private int maximum;
    private int minimum;
    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    public int getMinimum() {
        return minimum;
    }
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "Limits{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
