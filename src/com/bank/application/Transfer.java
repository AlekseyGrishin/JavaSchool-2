package com.bank.application;

import com.bank.entity.Client;

public class Transfer {
    public void transferMoney(Client client1, Client client2, int sum){
        int clientOf = client1.getBalance();
        int clientIn = client2.getBalance();
        System.out.println("Баланс '" + client1 + "' = " + clientOf);
        System.out.println("Баланс '" + client2 + "' = " + clientIn);
        clientIn = clientIn + sum;
        clientOf = clientOf - sum;
        System.out.println("' " + client1.getFirstName() + "' перевел клиенту '" + client2.getFirstName() + " сумму " + sum);
        System.out.println("Баланс '" + client1 + "' = " + clientOf);
        System.out.println("Баланс '" + client2 + "' = " + clientIn);
    }
}
