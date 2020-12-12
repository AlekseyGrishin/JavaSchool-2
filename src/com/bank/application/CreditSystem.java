package com.bank.application;

import com.bank.entity.Client;
import com.bank.entity.Credit;
import com.bank.service.CreditService;

public class CreditSystem implements CreditService {

    public void getCredit(Client client, Credit credit){
        System.out.println("Пользователю " + client + " выдан кредит в размере: " + credit.getSum() + ", на " + credit.getTime() + " года, по ставке - " + credit.getPercent() + " годовых");
    }

    public int repayCredit(Credit credit, int enterSum){
        int amount = credit.getSum() - enterSum;
        System.out.println("Вы внесли " + enterSum + " руб, оставшаяся сумма - " + amount);
        return amount;
    }

}
