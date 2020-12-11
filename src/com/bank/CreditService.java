package com.bank;

public interface CreditService {
    int sum = 0;
    int time = 0;
    double percent = 0;
    void getCredit(Client client, Credit credit);
    int repayCredit(Credit credit, int enterSum);
}
