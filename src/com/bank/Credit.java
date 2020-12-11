package com.bank;

public class Credit implements CreditService{
    private int sum;
    private int time;
    private double percent;
    Credit(int sum, int time, double percent){
        this.percent = percent;
        this.time = time;
        this.sum = sum;
    }
    @Override
    public void getCredit(Client client, Credit credit){
        System.out.println("Пользователю " + client + " выдан кредит в размере: " + sum + ", на " + time + " года, по ставке - " + percent + " годовых");
    }
    @Override
    public int repayCredit(Credit credit, int enterSum){
        int amount = sum - enterSum;
        System.out.println("Вы внесли " + enterSum + " руб, оставшаяся сумма - " + amount);
        return amount;
    }
}
