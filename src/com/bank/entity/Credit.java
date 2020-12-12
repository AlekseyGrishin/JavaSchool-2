package com.bank.entity;

public class Credit{

    private int sum;
    private int time;
    private double percent;

    public Credit(int sum, int time, double percent){
        this.percent = percent;
        this.time = time;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
