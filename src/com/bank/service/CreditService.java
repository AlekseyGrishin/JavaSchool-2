package com.bank.service;

import com.bank.entity.Client;
import com.bank.entity.Credit;

public interface CreditService {
    void getCredit(Client client, Credit credit);
    int repayCredit(Credit credit, int enterSum);
}
